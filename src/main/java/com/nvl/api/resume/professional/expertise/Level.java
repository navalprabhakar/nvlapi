/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional.expertise;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/**
 * The Enum Level.
 */
@JsonDeserialize(using = Level.LevelDeserializer.class)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Level {
	BGNR("beginner"), WRKG("working"), GOOD("good"), HIGH("high"), EXPT("expert");

	private String description;

	public String getDescription() {
		return description;
	}

	@JsonProperty("numberOfStars")
	public Integer getLevelStars() {
		return this.ordinal() + 1;
	}

	private Level(String aDescription) {
		description = aDescription;
	}
	
	/**
	 * The Class LevelDeserializer.
	 */
	public static class LevelDeserializer extends StdDeserializer<Level> {

		private static final long serialVersionUID = 7433467629649375419L;

		/**
		 * Instantiates a new level deserializer.
		 */
		public LevelDeserializer() {
			super(Level.class);
		}

		@Override
		public Level deserialize(JsonParser jp, DeserializationContext dc)
				throws IOException, JsonProcessingException {
			final JsonNode jsonNode = jp.readValueAsTree();
			String description = jsonNode.get("description").asText();

			for (Level me : Level.values()) {
				if (me.getDescription().equals(description)) {
					return me;
				}
			}
			throw dc.mappingException("Cannot deserialize Level from description " + description);
		}
	}
}