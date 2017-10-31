/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

/**
 * The Class QualificationService.
 */
@Service
public class QualificationService implements IQualificationService {

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/personal/qualification/qualification1.json")
	protected Resource staticJsonQualification1;

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi/"
			+ "master/src/main/resources/static/json/resume/personal/qualification/qualification2.json")
	protected Resource staticJsonQualification2;

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi/"
			+ "master/src/main/resources/static/json/resume/personal/qualification/qualification3.json")
	protected Resource staticJsonQualification3;

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi/"
			+ "master/src/main/resources/static/json/resume/personal/qualification/qualification4.json")
	protected Resource staticJsonQualification4;

	@Override
	public List<Qualification> getQualifications() {
		return readAll(Qualification.class, staticJsonQualification1, staticJsonQualification2,
				staticJsonQualification3, staticJsonQualification4);
	}

}
