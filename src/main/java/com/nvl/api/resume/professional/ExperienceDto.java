/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import java.io.Serializable;
import java.util.List;

/**
 * The Class ExperienceDto.
 */
public class ExperienceDto implements Serializable {

	private static final long serialVersionUID = -4512614827273210245L;

	private List<SkillDto> skills;
	private String summary;

	public List<SkillDto> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillDto> aSkills) {
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
		private List<SkillDto> skills;
		private String summary;

		/**
		 * Skills.
		 *
		 * @param skills
		 *            the skills
		 * @return the builder
		 */
		public Builder skills(List<SkillDto> skills) {
			this.skills = skills;
			return this;
		}

		/**
		 * Summary.
		 *
		 * @param summary
		 *            the summary
		 * @return the builder
		 */
		public Builder summary(String summary) {
			this.summary = summary;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the experience dto
		 */
		public ExperienceDto build() {
			ExperienceDto experienceDto = new ExperienceDto();
			experienceDto.skills = skills;
			experienceDto.summary = summary;
			return experienceDto;
		}
	}
}
