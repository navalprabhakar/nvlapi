/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume;

/**
 * The Enum ResumeUri.
 */
public final class ResumeUri {

	public static final String CV = "/cv";
	public static final String NVL = CV + "/nvl";
	public static final String PRSN = NVL + "/prsn";
	public static final String PROF = NVL + "/prof";
	public static final String EDU = PRSN + "/edu";

	private ResumeUri() {
	}
}
