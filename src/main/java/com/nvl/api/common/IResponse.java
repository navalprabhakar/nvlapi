package com.nvl.api.common;

public interface IResponse<T> {

	T getData();

	String getStatus();

	Integer getStatusCode();

	String getMessage();

}
