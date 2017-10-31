/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import java.util.List;
import java.util.PriorityQueue;

import com.nvl.api.common.Payload;

/**
 * The Class Education.
 */
public class Education implements Payload {

	private static final long serialVersionUID = 616589648248507644L;

	private PriorityQueue<Qualification> qualifications;

	public PriorityQueue<Qualification> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<Qualification> listQualifications) {
		qualifications = new PriorityQueue<Qualification>((Qualification q1, Qualification q2) -> {
			return q2.getDegreeDate().compareTo(q1.getDegreeDate());
		});
		listQualifications.forEach(qualifications::add);
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private PriorityQueue<Qualification> qualifications;

		/**
		 * Qualifications.
		 *
		 * @param qualifications the qualifications
		 * @return the builder
		 */
		public Builder qualifications(PriorityQueue<Qualification> qualifications) {
			this.qualifications = qualifications;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the education
		 */
		public Education build() {
			Education educationDto = new Education();
			educationDto.qualifications = qualifications;
			return educationDto;
		}
	}
}
