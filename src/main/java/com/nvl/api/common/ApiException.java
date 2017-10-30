/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class ApiException.
 */
public class ApiException extends RuntimeException {

	private static final long serialVersionUID = -5285386798295632327L;
	private final Map<String, String> context = new HashMap<>();

	ApiException() {
		super();
	}

	/**
	 * Instantiates a new api exception.
	 *
	 * @param message the message
	 */
	public ApiException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new api exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public ApiException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new api exception.
	 *
	 * @param cause the cause
	 */
	public ApiException(Throwable cause) {
		super(cause);
	}

	/**
	 * Context.
	 *
	 * @param attribute the attribute
	 * @param value the value
	 * @return the api exception
	 */
	public ApiException attribute(String attribute, String value) {
		context.put(attribute, value);
		return this;
	}

	public String getContextualInformation() {
		StringBuilder information = new StringBuilder().append("[ ");
		context.forEach((k, v) -> {
			information.append(k).append(":").append(v).append(", ");
		});
		return information.delete(information.length() - 2, information.length()).append(" ]").toString();
	}

	/**
	 * Gets the contextual value.
	 *
	 * @param key the key
	 * @return the contextual value
	 */
	public String getContextualValue(String key) {
		return context.getOrDefault(key, "");
	}

}
