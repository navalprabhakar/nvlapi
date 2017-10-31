/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import com.nvl.api.common.Payload;

/**
 * The Class Skill.
 */
public class Skill implements Payload {

	private static final long serialVersionUID = -4657411069876472590L;

	/**
	 * The Enum SkillType.
	 */
	public static enum SkillType {
		TECH("Technical"), BUSS("Business"), PRSN("Personal");

		private String type;

		public String getType() {
			return type;
		}

		SkillType(String aType) {
			type = aType;
		}
	}

	/**
	 * The Enum ExpertiseLevel.
	 */
	public static enum ExpertiseLevel {
		BGNR("Beginner"), MDRT("Moderate"), HIGH("High"), EXPT("Expert");

		private String description;

		public String getDescription() {
			return description;
		}

		public void setDescription(String aDescription) {
			description = aDescription;
		}

		private ExpertiseLevel(String aDescription) {
			description = aDescription;
		}
	}

	private String code;
	private String description;
	private ExpertiseLevel level;

	public String getCode() {
		return code;
	}

	public void setCode(String aCode) {
		code = aCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String aDescription) {
		description = aDescription;
	}

	public ExpertiseLevel getLevel() {
		return level;
	}

	public void setLevel(ExpertiseLevel aLevel) {
		level = aLevel;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private String code;
		private String description;
		private ExpertiseLevel level;

		/**
		 * Code.
		 *
		 * @param code the code
		 * @return the builder
		 */
		public Builder code(String code) {
			this.code = code;
			return this;
		}

		/**
		 * Description.
		 *
		 * @param description the description
		 * @return the builder
		 */
		public Builder description(String description) {
			this.description = description;
			return this;
		}

		/**
		 * Level.
		 *
		 * @param level the level
		 * @return the builder
		 */
		public Builder level(ExpertiseLevel level) {
			this.level = level;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the skill
		 */
		public Skill build() {
			Skill skillDto = new Skill();
			skillDto.code = code;
			skillDto.description = description;
			skillDto.level = level;
			return skillDto;
		}
	}
}
