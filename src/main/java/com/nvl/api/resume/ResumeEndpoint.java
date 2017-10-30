/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvl.api.common.ApiResponse;
import com.nvl.api.resume.service.IResumeService;
import com.nvl.api.resume.service.ResumeDto;

/**
 * The Class ResumeEndpoint.
 */
@RestController
@RequestMapping(path = ResumeUri.CV)
public class ResumeEndpoint {

	@Autowired
	IResumeService resumeService;

	@GetMapping("")
	public ApiResponse<ResumeDto> getResume() {
		return new ApiResponse.Builder<ResumeDto>().data(resumeService.getResume())
				.status(HttpStatus.FOUND.getReasonPhrase()).statusCode(HttpStatus.FOUND.value()).build();
	}
}
