/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class ApplicationEndpoint.
 */
@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApplicationEndpoint {

	/**
	 * Root.
	 *
	 * @return the string
	 */
	@GetMapping()
	public String root() {
		return "{ \"About\": \"NVL.API application by @Naval Prabhakar " + "\u00a9" + " 2017\" }";
	}

}
