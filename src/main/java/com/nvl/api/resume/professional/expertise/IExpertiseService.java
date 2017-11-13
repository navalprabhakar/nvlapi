/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional.expertise;

import java.util.List;

import com.nvl.api.common.service.IReadOnlyDataService;

/**
 * The Class IExpertiseService.
 */
public interface IExpertiseService extends IReadOnlyDataService<Expertise> {
	
	/**
	 * Gets the all expertise.
	 *
	 * @return the all expertise
	 */
	List<Expertise> getAllExpertise();
}
