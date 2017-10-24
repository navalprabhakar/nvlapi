/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.dto;

import java.io.Serializable;

/**
 * The Class CandidateDto.
 */
public class CandidateDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public CandidateDto withName(String name) {
		this.name = name;
		return this;
	}
}
