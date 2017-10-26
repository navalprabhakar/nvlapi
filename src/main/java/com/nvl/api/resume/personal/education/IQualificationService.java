/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import java.util.List;

import com.nvl.api.common.service.IReadOnlyDataService;

/**
 * The Interface IQualificationService.
 */
public interface IQualificationService extends IReadOnlyDataService<QualificationDto>{

	List<QualificationDto> getQualifications();

}
