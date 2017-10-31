/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal;

import com.nvl.api.common.service.IReadOnlyDataService;
import com.nvl.api.resume.personal.education.Education;

/**
 * The Interface IPersonalService.
 */
public interface IPersonalService extends IReadOnlyDataService<Candidate> {

	Candidate getCandidate();

	Education getEducation();
}
