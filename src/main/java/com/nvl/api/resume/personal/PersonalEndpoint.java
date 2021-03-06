/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvl.api.resume.ResumeUri;
import com.nvl.api.resume.personal.education.Education;

/**
 * The Class ResumeEndpoint.
 */
@RestController
@RequestMapping(path = ResumeUri.PRSN, produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonalEndpoint {

	@Autowired
	private IPersonalService personalService;

	@GetMapping()
	public Candidate of() {
		return personalService.getCandidate();
	}

	@GetMapping(path = ResumeUri.EDU)
	public Education education() {
		return personalService.getEducation();
	}
}
