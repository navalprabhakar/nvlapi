/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvl.api.resume.ResumeUri;
import com.nvl.api.resume.personal.education.EducationDto;

/**
 * The Class ResumeEndpoint.
 */
@RestController
@RequestMapping(path = ResumeUri.PRSN)
public class PersonalEndpoint {

	@Autowired
	private IPersonalService personalService;

	@GetMapping()
	public CandidateDto of() {
		return personalService.getCandidate();
	}

	@GetMapping(path = ResumeUri.EDU)
	public EducationDto education() {
		return personalService.getEducation();
	}
}
