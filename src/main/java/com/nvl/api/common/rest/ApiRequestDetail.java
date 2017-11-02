/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common.rest;

import java.net.URI;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

/**
 * The Class ApiRequestDetail.
 */
public class ApiRequestDetail {

	private URI uri;
	private HttpMethod method;
	private MediaType accept;
	private MediaType contentType;

	public URI getUri() {
		return uri;
	}

	public void setUri(URI aUri) {
		uri = aUri;
	}

	public HttpMethod getMethod() {
		return method;
	}

	public void setMethod(HttpMethod aMethod) {
		method = aMethod;
	}

	public MediaType getAccept() {
		return accept;
	}

	public void setAccept(MediaType aAccept) {
		accept = aAccept;
	}

	public MediaType getContentType() {
		return contentType;
	}

	public void setContentType(MediaType aContentType) {
		contentType = aContentType;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private URI uri;
		private HttpMethod method;
		private MediaType accept;
		private MediaType contentType;

		/**
		 * Uri.
		 *
		 * @param uri the uri
		 * @return the builder
		 */
		public Builder uri(URI uri) {
			this.uri = uri;
			return this;
		}

		/**
		 * Method.
		 *
		 * @param method the method
		 * @return the builder
		 */
		public Builder method(HttpMethod method) {
			this.method = method;
			return this;
		}

		/**
		 * Accept.
		 *
		 * @param accept the accept
		 * @return the builder
		 */
		public Builder accept(MediaType accept) {
			this.accept = accept;
			return this;
		}

		/**
		 * Content type.
		 *
		 * @param contentType the content type
		 * @return the builder
		 */
		public Builder contentType(MediaType contentType) {
			this.contentType = contentType;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the api request detail
		 */
		public ApiRequestDetail build() {
			ApiRequestDetail apiRequestDetail = new ApiRequestDetail();
			apiRequestDetail.uri = uri;
			apiRequestDetail.method = method;
			apiRequestDetail.accept = accept;
			apiRequestDetail.contentType = contentType;
			return apiRequestDetail;
		}
	}
}
