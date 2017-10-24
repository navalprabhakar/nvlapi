package com.nvl.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class ApplicationEndpoint {

	@GetMapping(path = "")
	public String root() {
		return "NVL.API application by @Naval Prabhakar " + "\u00a9" + " 2017";
	}

}
