/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common;

/**
 * The Class ApiError.
 */
public class ApiError implements IError {

	String errorCode;
	String errorMessage;
	Throwable errorReason;

	@Override
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String aErrorCode) {
		errorCode = aErrorCode;
	}

	@Override
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String aErrorMessage) {
		errorMessage = aErrorMessage;
	}

	@Override
	public Throwable getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(Throwable aErrorReason) {
		errorReason = aErrorReason;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private String errorCode;
		private String errorMessage;
		private Throwable errorReason;

		/**
		 * Error code.
		 *
		 * @param errorCode the error code
		 * @return the builder
		 */
		public Builder errorCode(String errorCode) {
			this.errorCode = errorCode;
			return this;
		}

		/**
		 * Error message.
		 *
		 * @param errorMessage the error message
		 * @return the builder
		 */
		public Builder errorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
			return this;
		}

		/**
		 * Error reason.
		 *
		 * @param errorReason the error reason
		 * @return the builder
		 */
		public Builder errorReason(Throwable errorReason) {
			this.errorReason = errorReason;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the api error
		 */
		public ApiError build() {
			ApiError apiError = new ApiError();
			apiError.errorCode = errorCode;
			apiError.errorMessage = errorMessage;
			apiError.errorReason = errorReason;
			return apiError;
		}
	}
}
