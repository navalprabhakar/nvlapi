/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import java.io.Serializable;
import java.util.List;
import java.util.PriorityQueue;

/**
 * The Class EducationDto.
 */
public class EducationDto implements Serializable {

	private static final long serialVersionUID = 616589648248507644L;

	private PriorityQueue<QualificationDto> qualifications;

	public PriorityQueue<QualificationDto> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<QualificationDto> listQualifications) {
		qualifications = new PriorityQueue<QualificationDto>((QualificationDto q1, QualificationDto q2) -> {
			return q2.getDegreeDate().compareTo(q1.getDegreeDate());
		});
		listQualifications.forEach(qualifications::add);
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private PriorityQueue<QualificationDto> qualifications;

		/**
		 * Qualifications.
		 *
		 * @param qualifications the qualifications
		 * @return the builder
		 */
		public Builder qualifications(PriorityQueue<QualificationDto> qualifications) {
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
