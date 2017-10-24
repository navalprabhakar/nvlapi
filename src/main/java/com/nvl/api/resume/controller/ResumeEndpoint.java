/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvl.api.resume.dto.CandidateDto;

/**
 * The Class ResumeEndpoint.
 */
@RestController
@RequestMapping(path = ResumeUri.CV)
public class ResumeEndpoint {

	/**
	 * Of.
	 *
	 * @return the candidate dto
	 */
	@GetMapping(path = ResumeUri.OF)
	public CandidateDto of() {
		return new CandidateDto().withName("Naval Prabhakar");
	}
}
