/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import java.util.List;

import com.nvl.api.common.service.IReadOnlyDataService;
import com.nvl.api.resume.professional.expertise.Expertise;

/**
 * The Interface IProfessionalService.
 */
public interface IProfessionalService extends IReadOnlyDataService<Experience> {
	
	/**
	 * Gets the expertises.
	 *
	 * @return the expertises
	 */
	List<Expertise> getExpertises();

	/**
	 * Gets the experience duration.
	 *
	 * @return the experience duration
	 */
	String getExperienceDuration();

	/**
	 * Gets the experience.
	 *
	 * @return the experience
	 */
	Experience getExperience();
}
