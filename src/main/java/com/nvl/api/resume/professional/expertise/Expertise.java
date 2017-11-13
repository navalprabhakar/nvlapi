/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional.expertise;

import java.util.PriorityQueue;

import com.nvl.api.common.Payload;

/**
 * The Class Expertise.
 */
public class Expertise implements Payload, Comparable<Expertise> {

	private static final long serialVersionUID = -4657411069876472590L;

	private PriorityQueue<Competency> competencies;
	private ExpertiseType expertiseType;

	public PriorityQueue<Competency> getCompetencies() {
		return competencies;
	}

	public void setCompetencies(PriorityQueue<Competency> aCompetencies) {
		competencies = aCompetencies;
	}

	public ExpertiseType getExpertiseType() {
		return expertiseType;
	}

	public void setType(ExpertiseType aExpertiseType) {
		expertiseType = aExpertiseType;
	}

	@Override
	public int compareTo(Expertise other) {
		return Integer.valueOf(this.expertiseType.ordinal()).compareTo(Integer.valueOf(other.expertiseType.ordinal()));
	}
}
