/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * The Class QualificationDto.
 */
public class QualificationDto implements Serializable {

	private static final long serialVersionUID = -6188811588363031986L;

	private Degree degree;
	private String institution;
	private LocalDate degreeYear;
	private Short percentage;

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree aDegree) {
		degree = aDegree;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String aInstitution) {
		institution = aInstitution;
	}

	public LocalDate getDegreeYear() {
		return degreeYear;
	}

	public void setDegreeYear(LocalDate aDegreeYear) {
		degreeYear = aDegreeYear;
	}

	public Short getPercentage() {
		return percentage;
	}

	public void setPercentage(Short aPercentage) {
		percentage = aPercentage;
	}

	/**
	 * The Enum Degree.
	 */
	public static enum Degree {

		MCA("MCA", "Master in Computer Applications"), BSCHCS("BSc(H)-CS",
				"Bachelor of Science in Computer Science"), BSCHP("BSc(H)-PHY", "Bachelor of Science in Physics"), BAHM(
						"BA(H)-MATHS", "Bachelor of Art in Mathematics"), XIIS("12-S", "Intermediate, Science"), XIIC(
								"12-C", "Intermediate, Commerce"), XIIA("12-A", "Intermediate, Art"), X("10", "Board");

		String code;
		String name;

		public String getCode() {
			return code;
		}

		public void setCode(String aCode) {
			code = aCode;
		}

		public String getName() {
			return name;
		}

		public void setName(String aName) {
			name = aName;
		}

		Degree(String aCode, String aName) {
			code = aCode;
			name = aName;
		}
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private Degree degree;
		private String institution;
		private LocalDate degreeYear;
		private Short percentage;

		/**
		 * Degree.
		 *
		 * @param degree the degree
		 * @return the builder
		 */
		public Builder degree(Degree degree) {
			this.degree = degree;
			return this;
		}

		/**
		 * Institution.
		 *
		 * @param institution the institution
		 * @return the builder
		 */
		public Builder institution(String institution) {
			this.institution = institution;
			return this;
		}

		/**
		 * Degree year.
		 *
		 * @param degreeYear the degree year
		 * @return the builder
		 */
		public Builder degreeYear(LocalDate degreeYear) {
			this.degreeYear = degreeYear;
			return this;
		}

		/**
		 * Percentage.
		 *
		 * @param percentage the percentage
		 * @return the builder
		 */
		public Builder percentage(Short percentage) {
			this.percentage = percentage;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the qualification dto
		 */
		public QualificationDto build() {
			QualificationDto qualificationDto = new QualificationDto();
			qualificationDto.degree = degree;
			qualificationDto.institution = institution;
			qualificationDto.degreeYear = degreeYear;
			qualificationDto.percentage = percentage;
			return qualificationDto;
		}
	}
}
