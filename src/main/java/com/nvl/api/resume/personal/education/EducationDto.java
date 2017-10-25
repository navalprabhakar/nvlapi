/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import java.io.Serializable;
import java.util.List;

/**
 * The Class EducationDto.
 */
public class EducationDto implements Serializable {

	private static final long serialVersionUID = 616589648248507644L;

	private List<QualificationDto> qualifications;

	public List<QualificationDto> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<QualificationDto> aQualifications) {
		qualifications = aQualifications;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private List<QualificationDto> qualifications;

		/**
		 * Qualifications.
		 *
		 * @param qualifications
		 *            the qualifications
		 * @return the builder
		 */
		public Builder qualifications(List<QualificationDto> qualifications) {
			this.qualifications = qualifications;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the education dto
		 */
		public EducationDto build() {
			EducationDto educationDto = new EducationDto();
			educationDto.qualifications = qualifications;
			return educationDto;
		}
	}
}
