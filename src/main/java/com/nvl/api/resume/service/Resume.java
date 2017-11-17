/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.service;

import java.util.List;

import com.nvl.api.common.Payload;
import com.nvl.api.resume.personal.Candidate;
import com.nvl.api.resume.personal.education.Education;
import com.nvl.api.resume.professional.Experience;

/**
 * The Class Resume.
 */
public class Resume implements Payload {

	private static final long serialVersionUID = -7429099854863254655L;

	private Candidate candidate;
	private String highlights;
	private String mission;
	private List<String> milestonesToGo;
	private List<String> milestonesSeen;
	private Experience experience;
	private Education education;

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate aCandidate) {
		candidate = aCandidate;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education aEducation) {
		education = aEducation;
	}

	public String getHighlights() {
		return highlights;
	}

	public void setHighlights(String aHighlights) {
		highlights = aHighlights;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String aMission) {
		mission = aMission;
	}

	public List<String> getMilestonesToGo() {
		return milestonesToGo;
	}

	public void setMilestonesToGo(List<String> aMilestonesToGo) {
		milestonesToGo = aMilestonesToGo;
	}

	public List<String> getMilestonesSeen() {
		return milestonesSeen;
	}

	public void setMilestonesSeen(List<String> aMilestonesSeen) {
		milestonesSeen = aMilestonesSeen;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience aExperience) {
		experience = aExperience;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private Candidate candidate;
		private String highlights;
		private String mission;
		private List<String> milestonesToGo;
		private List<String> milestonesSeen;
		private Education education;
		private Experience experience;

		/**
		 * Candidate.
		 *
		 * @param candidate the candidate
		 * @return the builder
		 */
		public Builder candidate(Candidate candidate) {
			this.candidate = candidate;
			return this;
		}

		/**
		 * Highlights.
		 *
		 * @param highlights the highlights
		 * @return the builder
		 */
		public Builder highlights(String highlights) {
			this.highlights = highlights;
			return this;
		}

		/**
		 * Mission.
		 *
		 * @param mission the mission
		 * @return the builder
		 */
		public Builder mission(String mission) {
			this.mission = mission;
			return this;
		}

		/**
		 * Milestones to go.
		 *
		 * @param milestonesToGo the milestones to go
		 * @return the builder
		 */
		public Builder milestonesToGo(List<String> milestonesToGo) {
			this.milestonesToGo = milestonesToGo;
			return this;
		}

		/**
		 * Milestones seen.
		 *
		 * @param milestonesSeen the milestones seen
		 * @return the builder
		 */
		public Builder milestonesSeen(List<String> milestonesSeen) {
			this.milestonesSeen = milestonesSeen;
			return this;
		}

		/**
		 * Education.
		 *
		 * @param education the education
		 * @return the builder
		 */
		public Builder education(Education education) {
			this.education = education;
			return this;
		}

		/**
		 * Experience.
		 *
		 * @param experience the experience
		 * @return the builder
		 */
		public Builder experience(Experience experience) {
			this.experience = experience;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the resume
		 */
		public Resume build() {
			Resume resumeDto = new Resume();
			resumeDto.candidate = candidate;
			resumeDto.highlights = highlights;
			resumeDto.mission = mission;
			resumeDto.milestonesToGo = milestonesToGo;
			resumeDto.milestonesSeen = milestonesSeen;
			resumeDto.education = education;
			resumeDto.experience = experience;
			return resumeDto;
		}
	}
}
