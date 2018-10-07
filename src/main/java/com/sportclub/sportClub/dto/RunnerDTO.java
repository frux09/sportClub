package com.sportclub.sportClub.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RunnerDTO {

	private Integer id;
	private String name;
	private Integer year;
}
