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
		/* Add Personal end Educational information */
		Candidate candidate = personalService.getCandidate();
		Education education = personalService.getEducation();

		Resume resume = read(Resume.class, staticJsonResume);
		resume.setCandidate(candidate);
		resume.setEducation(education);

		/* Add Professional information */
		Experience experience = new Experience.Builder().summary(
				"Worked on all application life cycle phases focussed on JEE server side, modern web client side with Angular Typescript in domains including finance, automation and telecommunications")
				.skills(professionalService.getExpertises()).build();
		resume.setExperience(experience);

		return resume;
	}

}
