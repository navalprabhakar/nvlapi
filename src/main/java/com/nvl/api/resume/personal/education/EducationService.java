/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

/**
 * The Class EducationService.
 */
@Service
public class EducationService implements IEducationService {

	@Value("classpath:/static/json/resume/personal/education.json")
	protected Resource staticJsonEducation;

	/** The qualification service. */
	@Autowired
	IQualificationService qualificationService;

	@Override
	public EducationDto getEducation() {
		EducationDto education = read(staticJsonEducation, EducationDto.class);		
		education.setQualifications(qualificationService.getQualifications());
		
		return education;
	}

}
