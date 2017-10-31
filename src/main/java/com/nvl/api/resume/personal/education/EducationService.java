/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class EducationService.
 */
@Service
public class EducationService implements IEducationService {

	/*
	 * @Value("classpath:static/json/resume/personal/education.json") protected
	 * Resource staticJsonEducation;
	 */

	/** The qualification service. */
	@Autowired
	IQualificationService qualificationService;

	@Override
	public Education getEducation() {
		Education education = new Education.Builder().build();
		education.setQualifications(qualificationService.getQualifications());
		return education;
	}

}
