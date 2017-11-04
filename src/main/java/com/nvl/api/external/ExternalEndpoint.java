/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvl.api.common.ApiResponse;

/**
 * The Class ExternalEndpoint.
 */
@RestController
@RequestMapping(path = ExternalUri.EXTERNAL, produces = MediaType.APPLICATION_JSON_VALUE)
public class ExternalEndpoint {

	@Autowired
	IExternalService externalService;

	/**
	 * Gets the quote of day.
	 *
	 * @param day the day
	 * @param month the month
	 * @return the quote of day
	 */
	@GetMapping(path = ExternalUri.THISDAY_DAY_MONTH)
	public ApiResponse<String> getQuoteOfDay(@PathVariable Integer day, @PathVariable Integer month) {
		return new ApiResponse.Builder<String>().data(externalService.getQuoteOfDay(day, month))
				.status(HttpStatus.FOUND.getReasonPhrase()).statusCode(HttpStatus.FOUND.value()).build();
	}
}
