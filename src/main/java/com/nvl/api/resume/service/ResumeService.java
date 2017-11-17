package com.nvl.api.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.nvl.api.resume.personal.Candidate;
import com.nvl.api.resume.personal.IPersonalService;
import com.nvl.api.resume.personal.education.Education;
import com.nvl.api.resume.professional.Experience;
import com.nvl.api.resume.professional.IProfessionalService;

@Service
public class ResumeService implements IResumeService {

	@Autowired
	IPersonalService personalService;

	@Autowired
	IProfessionalService professionalService;

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/resume.json")
	protected Resource staticJsonResume;

	@Override
	public Resume getResume() {
		Resume resume = read(Resume.class, staticJsonResume);

		resume.setCandidate(personalService.getCandidate());
		resume.setExperience(professionalService.getExperience());
		resume.setEducation(personalService.getEducation());
		return resume;
	}

}
