/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional.expertise;

/**
 * The Class Competency.
 */
public class Competency implements Comparable<Competency> {
	private Skill skill;
	private Level level;

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill aSkill) {
		skill = aSkill;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level aLevel) {
		level = aLevel;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private Skill skill;
		private Level level;

		/**
		 * Skill.
		 *
		 * @param skill the skill
		 * @return the builder
		 */
		public Builder skill(Skill skill) {
			this.skill = skill;
			return this;
		}

		/**
		 * Level.
		 *
		 * @param level the level
		 * @return the builder
		 */
		public Builder level(Level level) {
			this.level = level;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the competency
		 */
		public Competency build() {
			Competency competency = new Competency();
			competency.skill = skill;
			competency.level = level;
			return competency;
		}
	}

	@Override
	public int compareTo(Competency other) {
		return Integer.valueOf(other.level.ordinal()).compareTo(Integer.valueOf(this.level.ordinal()));
	}
}
