package com.sportclub.sportClub.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultDTO {

	private Integer id;
	private Integer idRunner;
	private Integer seconds;
}
