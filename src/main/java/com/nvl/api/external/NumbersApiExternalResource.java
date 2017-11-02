/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.external;

import com.nvl.api.common.rest.UriResource;

/**
 * The Enum NumbersApiExternalResource.
 */
public enum NumbersApiExternalResource implements UriResource {

	THISDAY_DAY_MONTH("/{month}/{day}/date");

	/** The Constant HOST_URI. */
	public static final String HOST_URI = "http://numbersapi.com";
	private String resourceUri;

	NumbersApiExternalResource(String resourceUri) {
		this.resourceUri = resourceUri;
	}

	@Override
	public String hostUri() {
		return HOST_URI;
	}

	@Override
	public String resourceUri() {
		return resourceUri;
	}

}
