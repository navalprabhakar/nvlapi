/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal.education;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nvl.api.common.converter.CustomLocalDateDeserializer;
import com.nvl.api.common.converter.CustomLocalDateSerializer;

/**
 * The Class QualificationDto.
 */
public class QualificationDto implements Serializable {

	private static final long serialVersionUID = -6188811588363031986L;

	private Degree degree;
	private String institution;

	@JsonSerialize(using = CustomLocalDateSerializer.class)
	@JsonDeserialize(using = CustomLocalDateDeserializer.class)
	private LocalDate degreeDate;

	private Float percentage;

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

	public LocalDate getDegreeDate() {
		return degreeDate;
	}

	public void setDegreeDate(LocalDate aDegreeDate) {
		degreeDate = aDegreeDate;
	}

	public Float getPercentage() {
		return percentage;
	}

	public void setPercentage(Float aPercentage) {
		percentage = aPercentage;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private Degree degree;
		private String institution;
		private LocalDate degreeDate;
		private Float percentage;

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
		 * @param degreeDate the degree year
		 * @return the builder
		 */
		public Builder degreeDate(LocalDate degreeDate) {
			this.degreeDate = degreeDate;
			return this;
		}

		/**
		 * Percentage.
		 *
		 * @param percentage the percentage
		 * @return the builder
		 */
		public Builder percentage(Float percentage) {
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
			qualificationDto.degreeDate = degreeDate;
			qualificationDto.percentage = percentage;
			return qualificationDto;
		}
	}
}
