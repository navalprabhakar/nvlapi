/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.personal;

import java.io.Serializable;

/**
 * The Class CandidateDto.
 */
public class CandidateDto implements Serializable {

	private static final long serialVersionUID = 7351957835996499134L;

	private String name;
	private String city;
	private String country;
	private String email;
	private String github;
	private String website;
	private String linkedIn;
	private String twitter;

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String aCountry) {
		country = aCountry;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String aCity) {
		city = aCity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String aEmail) {
		email = aEmail;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String aGithub) {
		github = aGithub;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String aWebsite) {
		website = aWebsite;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String aLinkedIn) {
		linkedIn = aLinkedIn;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String aTwitter) {
		twitter = aTwitter;
	}

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		private String name;
		private String country;

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
		 * Country.
		 *
		 * @param country the country
		 * @return the builder
		 */
		public Builder country(String country) {
			this.country = country;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the candidate dto
		 */
		public CandidateDto build() {
			CandidateDto candidateDto = new CandidateDto();
			candidateDto.name = name;
			candidateDto.country = country;
			return candidateDto;
		}
	}
}
