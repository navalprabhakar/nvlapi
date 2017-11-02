/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common.rest;

import java.net.URI;
import java.util.Collections;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import com.nvl.api.common.ApiResponse;

/**
 * The Class ApiRestTemplate.
 */
@Component
public class ApiRestTemplate extends RestTemplate {

	/**
	 * Inits the.
	 */
	@PostConstruct
	public void init() {
		setErrorHandler(new DefaultResponseErrorHandler());
	}

	/**
	 * Execute.
	 *
	 * @param <O> the generic type
	 * @param <I> the generic type
	 * @param requestDetail the request detail
	 * @param data the data
	 * @param response the response
	 * @return the api response
	 */
	public <O, I> ApiResponse<O> execute(ApiRequestDetail requestDetail, I data, Class<O> response) {
		ApiResponse<O> responseJSON = new ApiResponse.Builder<O>().build();
		HttpEntity<I> entity = requestWithHeaders(requestDetail, data);
		ResponseEntity<O> responseEntity = exchange(requestDetail.getUri(), requestDetail.getMethod(), entity,
				response);
		responseJSON.setData(responseEntity.getBody());
		responseJSON.setStatus(String.valueOf(responseEntity.getStatusCodeValue()));
		return responseJSON;
	}

	/**
	 * Gets the.
	 *
	 * @param <O> the generic type
	 * @param uri the uri
	 * @param responseType the response type
	 * @return the api response
	 */
	public <O> ApiResponse<O> get(URI uri, Class<O> responseType) {
		return apiResponse(getForEntity(uri, responseType));
	}

	private <O> ApiResponse<O> apiResponse(ResponseEntity<O> responseEntity) {
		ApiResponse<O> response = rawApiResponse();
		response.setData(responseEntity.getBody());
		response.setStatus(String.valueOf(responseEntity.getStatusCodeValue()));
		return response;
	}

	private <O> ApiResponse<O> rawApiResponse() {
		return new ApiResponse.Builder<O>().build();
	}

	private <I> HttpEntity<I> requestWithHeaders(ApiRequestDetail requestDetail, I data) {
		HttpHeaders headers = new HttpHeaders();
		MediaType mediaType = requestDetail.getContentType();
		headers.setContentType(mediaType != null ? mediaType : MediaType.APPLICATION_JSON);
		mediaType = requestDetail.getAccept();
		headers.setAccept(Collections.singletonList(mediaType != null ? mediaType : MediaType.APPLICATION_JSON));
		return new HttpEntity<I>(data, headers);
	}
}