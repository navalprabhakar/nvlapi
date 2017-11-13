/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional.expertise;

/**
 * The Class Skill.
 */
public class Skill {

	private String code;
	private String description;

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * Instantiates a new skill.
	 *
	 * @param code the code
	 * @param description the description
	 */
	public Skill(String code, String description) {
		this.code = code;
		this.description = description;
	}
}
