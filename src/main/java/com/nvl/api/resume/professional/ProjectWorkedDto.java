package com.nvl.api.resume.professional;

import java.time.LocalDate;
import java.util.List;
import java.util.PriorityQueue;

public class ProjectWorkedDto {
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private PriorityQueue<SkillDto> skillsByExpertiseLevel;
	private List<WorkSummaryDto> workSummary;
}
