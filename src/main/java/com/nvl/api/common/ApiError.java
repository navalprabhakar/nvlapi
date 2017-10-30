package com.nvl.api.common;

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

	public static class Builder {
		private String errorCode;
		private String errorMessage;
		private Throwable errorReason;

		public Builder errorCode(String errorCode) {
			this.errorCode = errorCode;
			return this;
		}

		public Builder errorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
			return this;
		}

		public Builder errorReason(Throwable errorReason) {
			this.errorReason = errorReason;
			return this;
		}

		public ApiError build() {
			ApiError apiError = new ApiError();
			apiError.errorCode = errorCode;
			apiError.errorMessage = errorMessage;
			apiError.errorReason = errorReason;
			return apiError;
		}
	}
}
