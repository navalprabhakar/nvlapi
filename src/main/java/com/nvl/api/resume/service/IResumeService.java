/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.service;

import com.nvl.api.common.service.IReadOnlyDataService;

/**
 * The Interface IResumeService.
 */
public interface IResumeService extends IReadOnlyDataService<Resume> {

	/**
	 * Gets the resume.
	 *
	 * @return the resume
	 */
	Resume getResume();

}
