/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import java.time.LocalDate;

import com.nvl.api.common.Payload;

/**
 * The Class CompanyWorked.
 */
public class CompanyWorked implements Payload {

	private static final long serialVersionUID = 5116273208602013781L;

	private String name;
	private LocalDate startDate;
	private LocalDate endDate;

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate aStartDate) {
		startDate = aStartDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate aEndDate) {
		endDate = aEndDate;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private String name;
		private LocalDate startDate;
		private LocalDate endDate;

		/**
		 * Name.
		 *
		 * @param name the name
		 * @return the builder
		 */
		public Builder name(String name) {
			this.name = name;
			return this;
		}

		/**
		 * Start date.
		 *
		 * @param startDate the start date
		 * @return the builder
		 */
		public Builder startDate(LocalDate startDate) {
			this.startDate = startDate;
			return this;
		}

		/**
		 * End date.
		 *
		 * @param endDate the end date
		 * @return the builder
		 */
		public Builder endDate(LocalDate endDate) {
			this.endDate = endDate;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the company worked
		 */
		public CompanyWorked build() {
			CompanyWorked companyDto = new CompanyWorked();
			companyDto.name = name;
			companyDto.startDate = startDate;
			companyDto.endDate = endDate;
			return companyDto;
		}
	}
}
