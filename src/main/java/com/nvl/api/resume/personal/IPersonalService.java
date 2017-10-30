/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal;

import com.nvl.api.common.service.IReadOnlyDataService;
import com.nvl.api.resume.personal.education.EducationDto;

/**
 * The Interface IPersonalService.
 */
public interface IPersonalService extends IReadOnlyDataService<CandidateDto> {

	CandidateDto getCandidate();

	EducationDto getEducation();
}
