/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

import com.nvl.api.common.ApiException;

/**
 * The Interface UriResource.
 */
public interface UriResource {
	String hostUri();

	String resourceUri();

	default URI uri() {
		try {
			return new URI(hostUri() + resourceUri());
		} catch (URISyntaxException e) {
			throw new ApiException("Url malformed", e);
		}
	}

	default URI uri(Optional<Map<String, ?>> pathParams, Optional<MultiValueMap<String, String>> queryParams) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(hostUri() + resourceUri());
		try {
			queryParams.ifPresent(builder::queryParams);
			//pathParams.ifPresent(builder::buildAndExpand);
			if (pathParams.isPresent()) {
				return builder.buildAndExpand(pathParams.get()).toUri();
			} else {
				return new URI(builder.toUriString());
			}
		} catch (URISyntaxException e) {
			throw new ApiException("Url malformed", e);
		}
	}

}
