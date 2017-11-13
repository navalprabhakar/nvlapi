/**
 * @project NVL.API
 * @author navalprabhakar
 */
package com.nvl.api.resume.professional;

import java.time.LocalDate;
import java.util.List;
import java.util.PriorityQueue;

import com.nvl.api.common.Payload;
import com.nvl.api.resume.professional.expertise.Expertise;

/**
 * The Class ProjectWorked.
 */
public class ProjectWorked implements Payload {
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private PriorityQueue<Expertise> skillsByExpertiseLevel;
	private List<WorkSummary> workSummary;
}
