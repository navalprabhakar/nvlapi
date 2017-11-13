/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional.expertise;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

/**
 * The Class ExpertiseService.
 */
@Service
public class ExpertiseService implements IExpertiseService {

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/professional/expertise/expertise-business.json")
	protected Resource staticJsonExpertiseBusiness;

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/professional/expertise/expertise-interpersonal.json")
	protected Resource staticJsonExpertiseInterpersonal;

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/professional/expertise/expertise-technical-serverside.json")
	protected Resource staticJsonExpertiseTechnicalServerside;

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/professional/expertise/expertise-technical-clientside.json")
	protected Resource staticJsonExpertiseTechnicalClientside;

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/professional/expertise/expertise-technical-infrastructure.json")
	protected Resource staticJsonExpertiseTechnicalInfrastructure;

	@Override
	public List<Expertise> getAllExpertise() {
		return readAll(Expertise.class, staticJsonExpertiseBusiness, staticJsonExpertiseInterpersonal,
				staticJsonExpertiseTechnicalServerside, staticJsonExpertiseTechnicalClientside,
				staticJsonExpertiseTechnicalInfrastructure);
	}

}
