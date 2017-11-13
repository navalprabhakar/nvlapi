/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import java.util.List;

import com.nvl.api.resume.professional.expertise.Expertise;

/**
 * The Interface IProfessionalService.
 */
public interface IProfessionalService {
	
	/**
	 * Gets the expertises.
	 *
	 * @return the expertises
	 */
	List<Expertise> getExpertises();
}
