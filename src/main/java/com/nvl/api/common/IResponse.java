/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common;

/**
 * The Interface IResponse.
 *
 * @param <T> the generic type
 */
public interface IResponse<T> {

	T getData();

	String getStatus();

	Integer getStatusCode();

	String getMessage();

}
