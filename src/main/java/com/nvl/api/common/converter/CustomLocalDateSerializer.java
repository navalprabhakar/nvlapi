/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common.converter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * The Class CustomLocalDateSerializer.
 */
public class CustomLocalDateSerializer extends StdSerializer<LocalDate> {

	private static final long serialVersionUID = 452435442809285663L;
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	/**
	 * Instantiates a new custom local date serializer.
	 */
	public CustomLocalDateSerializer() {
		this(null);
	}

	/**
	 * Instantiates a new custom local date serializer.
	 *
	 * @param t the t
	 */
	public CustomLocalDateSerializer(Class<LocalDate> t) {
		super(t);
	}

	@Override
	public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider arg2)
			throws IOException, JsonProcessingException {
		gen.writeString(formatter.format(value));
	}
}
