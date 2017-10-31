/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import java.util.List;

import com.nvl.api.common.Payload;

/**
 * The Class Experience.
 */
public class Experience implements Payload {

	private static final long serialVersionUID = -4512614827273210245L;

	private List<Skill> skills;
	private String summary;

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> aSkills) {
		skills = aSkills;
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
		private List<Skill> skills;
		private String summary;

		/**
		 * Skills.
		 *
		 * @param skills the skills
		 * @return the builder
		 */
		public Builder skills(List<Skill> skills) {
			this.skills = skills;
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
			experienceDto.skills = skills;
			experienceDto.summary = summary;
			return experienceDto;
		}
	}
}
