package com.nvl.api.resume.personal.education;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/**
 * The Enum Degree.
 */
@JsonDeserialize(using = Degree.DegreeDeserializer.class)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Degree {

	MCA("MCA", "Master in Computer Applications"), BSCHCS("BSc(H)-CS",
			"Bachelor of Science in Computer Science"), BSCHP("BSc(H)-PHY", "Bachelor of Science in Physics"), BAHM(
					"BA(H)-MATHS", "Bachelor of Art in Mathematics"), XIIS("12-S", "Intermediate, Science"), XIIC(
							"12-C", "Intermediate, Commerce"), XIIA("12-A", "Intermediate, Art"), X("10", "Board");

	String code;
	String name;

	public String getCode() {
		return code;
	}

	public void setCode(String aCode) {
		code = aCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	Degree(String aCode, String aName) {
		code = aCode;
		name = aName;
	}

	/**
	 * The Class DegreeDeserializer.
	 */
	public static class DegreeDeserializer extends StdDeserializer<Degree> {

		private static final long serialVersionUID = 7433467629649375419L;

		/**
		 * Instantiates a new degree deserializer.
		 */
		public DegreeDeserializer() {
			super(Degree.class);
		}

		@Override
		public Degree deserialize(JsonParser jp, DeserializationContext dc)
				throws IOException, JsonProcessingException {
			final JsonNode jsonNode = jp.readValueAsTree();
			String code = jsonNode.get("code").asText();

			for (Degree me : Degree.values()) {
				if (me.getCode().equals(code)) {
					return me;
				}
			}
			throw dc.mappingException("Cannot deserialize Degree from code " + code);
		}
	}
}