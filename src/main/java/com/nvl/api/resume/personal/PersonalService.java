/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.nvl.api.resume.personal.education.EducationDto;
import com.nvl.api.resume.personal.education.IEducationService;

/**
 * The Class PersonalService.
 */
@Service
public class PersonalService implements IPersonalService {

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/personal/candidate.json")
	protected Resource staticJsonCandidate;

	@Autowired
	private IEducationService educationService;

	@Override
	public CandidateDto getCandidate() {
		return read(CandidateDto.class, staticJsonCandidate);
	}

	@Override
	public EducationDto getEducation() {
		return educationService.getEducation();
	}

}
