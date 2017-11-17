/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.nvl.api.resume.professional.expertise.Expertise;
import com.nvl.api.resume.professional.expertise.IExpertiseService;

/**
 * The Class ProfessionalService.
 */
@Service
public class ProfessionalService implements IProfessionalService {

	private static final LocalDate START_DATE = LocalDate.of(2009, 12, 07);
	private static final String PLACEHOLDER_EXPERIENCE_PERIOD = "<EXPERIENCE-PERIOD>";

	@Value("https://raw.githubusercontent.com/navalprabhakar/nvlapi"
			+ "/master/src/main/resources/static/json/resume/professional/experience.json")
	protected Resource staticJsonExperience;

	@Autowired
	private IExpertiseService expertiseService;

	@Override
	public List<Expertise> getExpertises() {
		return expertiseService.getAllExpertise().stream().sorted().collect(Collectors.toList());
	}

	@Override
	public String getExperienceDuration() {
		Period period = START_DATE.until(LocalDate.now());
		return period.getYears() + " Years " + period.getMonths() + " months";
	}

	@Override
	public Experience getExperience() {
		Experience experience = read(Experience.class, staticJsonExperience);
		experience
				.setSummary(experience.getSummary().replaceFirst(PLACEHOLDER_EXPERIENCE_PERIOD, getExperienceDuration()));
		experience.setExpertises(getExpertises());
		return experience;
	}
}
