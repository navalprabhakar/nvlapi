/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nvl.api.resume.professional.expertise.Expertise;
import com.nvl.api.resume.professional.expertise.IExpertiseService;

/**
 * The Class ProfessionalService.
 */
@Service
public class ProfessionalService implements IProfessionalService {

	@Autowired
	private IExpertiseService expertiseService;

	@Override
	public List<Expertise> getExpertises() {
		return expertiseService.getAllExpertise().stream().sorted().collect(Collectors.toList());
	}

}
