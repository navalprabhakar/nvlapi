package com.nvl.api.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.nvl.api.resume.personal.CandidateDto;
import com.nvl.api.resume.personal.IPersonalService;
import com.nvl.api.resume.personal.education.EducationDto;

@Service
public class ResumeService implements IResumeService {

	@Autowired
	IPersonalService personalService;

	@Value("classpath:/static/json/resume/resume.json")
	protected Resource staticJsonResume;

	@Override
	public ResumeDto getResume() {
		CandidateDto candidate = personalService.getCandidate();
		EducationDto education = personalService.getEducation();

		ResumeDto resume = read(staticJsonResume, ResumeDto.class);
		resume.setCandidate(candidate);
		resume.setEducation(education);
		return resume;
	}

}
