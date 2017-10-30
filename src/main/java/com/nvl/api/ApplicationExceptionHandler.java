package com.nvl.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nvl.api.common.ApiError;
import com.nvl.api.common.ApiException;
import com.nvl.api.common.ApiResponse;

@Order(Ordered.HIGHEST_PRECEDENCE)
@EnableWebMvc
@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		Map<String, String> responseBody = new HashMap<>();
		responseBody.put("path", ex.getRequestURL());
		responseBody.put("message", "No current NVL.API service found (404).");
		return new ResponseEntity<Object>(responseBody, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ApiException.class)
	@ResponseBody
	public ApiResponse<ApiError> apiError(ApiException ex) {
		ApiError error = new ApiError.Builder().errorCode("E001")
				.errorMessage(ex.getMessage() + ". Context: " + ex.getContextualInformation()).errorReason(ex).build();
		return new ApiResponse.Builder<ApiError>().data(error).message("Internal System error")
				.status(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
				.statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value()).build();
	}
}