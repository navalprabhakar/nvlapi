/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.service;

import java.io.Serializable;
import java.util.List;

import com.nvl.api.resume.personal.CandidateDto;
import com.nvl.api.resume.personal.education.EducationDto;

/**
 * The Class ResumeDto.
 */
public class ResumeDto implements Serializable {

	private static final long serialVersionUID = -7429099854863254655L;

	private CandidateDto candidate;
	private String highlights;
	private String mission;
	private List<String> milestonesToGo;
	private List<String> milestonesSeen;
	private EducationDto education;

	public CandidateDto getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateDto aCandidate) {
		candidate = aCandidate;
	}

	public EducationDto getEducation() {
		return education;
	}

	public void setEducation(EducationDto aEducation) {
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

	/**
	 * The Class Builder.
	 */
	public static class Builder {

		private CandidateDto candidate;
		private String highlights;
		private String mission;
		private List<String> milestonesToGo;
		private List<String> milestonesSeen;
		private EducationDto education;

		/**
		 * Candidate.
		 *
		 * @param candidate the candidate
		 * @return the builder
		 */
		public Builder candidate(CandidateDto candidate) {
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
		public Builder education(EducationDto education) {
			this.education = education;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the resume dto
		 */
		public ResumeDto build() {
			ResumeDto resumeDto = new ResumeDto();
			resumeDto.candidate = candidate;
			resumeDto.highlights = highlights;
			resumeDto.mission = mission;
			resumeDto.milestonesToGo = milestonesToGo;
			resumeDto.milestonesSeen = milestonesSeen;
			resumeDto.education = education;
			return resumeDto;
		}
	}
}
