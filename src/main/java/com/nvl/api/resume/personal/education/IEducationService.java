/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import com.nvl.api.common.service.IReadOnlyDataService;

/**
 * The Interface IEducationService.
 */
public interface IEducationService extends IReadOnlyDataService<EducationDto> {

	EducationDto getEducation();

}
