/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional.expertise;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/**
 * The Enum ExpertiseType.
 */
@JsonDeserialize(using = ExpertiseType.ExpertiseTypeDeserializer.class)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ExpertiseType {
	TSER("TSER", "technical server side"), TCLI("TCLI", "technical client side"), TINF("TINF",
			"technical infrastructure"), BUSI("BUSI", "business"), IPER("IPER", "interpersonal");

	private String type;
	private String description;

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	ExpertiseType(String aType, String aDescription) {
		type = aType;
		description = aDescription;
	}

	/**
	 * The Class LevelDeserializer.
	 */
	public static class ExpertiseTypeDeserializer extends StdDeserializer<ExpertiseType> {

		private static final long serialVersionUID = 7433467629649375419L;

		/**
		 * Instantiates a new level deserializer.
		 */
		public ExpertiseTypeDeserializer() {
			super(ExpertiseType.class);
		}

		@Override
		public ExpertiseType deserialize(JsonParser jp, DeserializationContext dc)
				throws IOException, JsonProcessingException {
			final JsonNode jsonNode = jp.readValueAsTree();
			String type = jsonNode.get("type").asText();

			for (ExpertiseType me : ExpertiseType.values()) {
				if (me.getType().equals(type)) {
					return me;
				}
			}
			throw dc.mappingException("Cannot deserialize ExpertiseType from type " + type);
		}
	}
}