/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import java.util.List;

import com.nvl.api.common.Payload;
import com.nvl.api.resume.professional.expertise.Expertise;

/**
 * The Class Experience.
 */
public class Experience implements Payload {

	private static final long serialVersionUID = -4512614827273210245L;

	private List<Expertise> expertises;
	private String summary;

	public List<Expertise> getExpertises() {
		return expertises;
	}

	public void setExpertises(List<Expertise> aExpertises) {
		expertises = aExpertises;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String aSummary) {
		summary = aSummary;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private List<Expertise> expertises;
		private String summary;

		/**
		 * Skills.
		 *
		 * @param aExpertises the expertises
		 * @return the builder
		 */
		public Builder expertises(List<Expertise> aExpertises) {
			this.expertises = aExpertises;
			return this;
		}

		/**
		 * Summary.
		 *
		 * @param summary the summary
		 * @return the builder
		 */
		public Builder summary(String summary) {
			this.summary = summary;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the experience
		 */
		public Experience build() {
			Experience experienceDto = new Experience();
			experienceDto.expertises = expertises;
			experienceDto.summary = summary;
			return experienceDto;
		}
	}
}
