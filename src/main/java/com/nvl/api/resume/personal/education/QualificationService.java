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

	@Value("classpath:/static/json/resume/personal/qualification")
	protected Resource staticJsonQualifications;

	@Override
	public List<QualificationDto> getQualifications() {
		return readAll(staticJsonQualifications, QualificationDto.class);
	}

}
