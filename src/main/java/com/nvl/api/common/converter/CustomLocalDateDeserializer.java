/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common.converter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.expression.ParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/**
 * The Class CustomLocalDateDeserializer.
 */
public class CustomLocalDateDeserializer extends StdDeserializer<LocalDate> {

	private static final long serialVersionUID = 452435442809285663L;
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	/**
	 * Instantiates a new custom local date deserializer.
	 */
	public CustomLocalDateDeserializer() {
		this(null);
	}

	/**
	 * Instantiates a new custom local date deserializer.
	 *
	 * @param t the t
	 */
	public CustomLocalDateDeserializer(Class<LocalDate> t) {
		super(t);
	}

	@Override
	public LocalDate deserialize(JsonParser jsonparser, DeserializationContext context)
			throws IOException, JsonProcessingException {
		String date = jsonparser.getText();
		try {
			return LocalDate.parse(date, formatter);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

}
