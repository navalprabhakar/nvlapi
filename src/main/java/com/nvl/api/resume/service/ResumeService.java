package com.nvl.api.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.nvl.api.resume.personal.Candidate;
import com.nvl.api.resume.personal.IPersonalService;
import com.nvl.api.resume.personal.education.Education;

@Service
public class ResumeService implements IResumeService {

	@Autowired
	IPersonalService personalService;

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/resume.json")
	protected Resource staticJsonResume;

	@Override
	public Resume getResume() {
		Candidate candidate = personalService.getCandidate();
		Education education = personalService.getEducation();

		Resume resume = read(Resume.class, staticJsonResume);
		resume.setCandidate(candidate);
		resume.setEducation(education);
		return resume;
	}

}
