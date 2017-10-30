/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common;

/**
 * The Class ApiResponse.
 *
 * @param <T> the generic type
 */
public class ApiResponse<T> implements IResponse<T> {
	private String status;
	private Integer statusCode;
	private String message;
	private T data;

	@Override
	public String getStatus() {
		return status;
	}

	public void setStatus(String aStatus) {
		status = aStatus;
	}

	@Override
	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer aStatusCode) {
		statusCode = aStatusCode;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String aMessage) {
		message = aMessage;
	}

	@Override
	public T getData() {
		return data;
	}

	public void setData(T aData) {
		data = aData;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder<T> {
		private T data;
		private String status;
		private Integer statusCode;
		private String message;

		/**
		 * Data.
		 *
		 * @param data the data
		 * @return the builder
		 */
		public Builder<T> data(T data) {
			this.data = data;
			return this;
		}

		/**
		 * Status.
		 *
		 * @param status the status
		 * @return the builder
		 */
		public Builder<T> status(String status) {
			this.status = status;
			return this;
		}

		/**
		 * Status code.
		 *
		 * @param statusCode the status code
		 * @return the builder
		 */
		public Builder<T> statusCode(Integer statusCode) {
			this.statusCode = statusCode;
			return this;
		}

		/**
		 * Message.
		 *
		 * @param message the message
		 * @return the builder
		 */
		public Builder<T> message(String message) {
			this.message = message;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the api response
		 */
		public ApiResponse<T> build() {
			ApiResponse<T> apiResponse = new ApiResponse<T>();
			apiResponse.data = data;
			apiResponse.status = status;
			apiResponse.statusCode = statusCode;
			apiResponse.message = message;
			return apiResponse;
		}
	}
}
