/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.common;

/**
 * The Interface IError.
 */
public interface IError {

	String getErrorCode();

	String getErrorMessage();

	Throwable getErrorReason();
}
