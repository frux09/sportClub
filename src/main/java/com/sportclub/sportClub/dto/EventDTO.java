package com.sportclub.sportClub.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EventDTO {

	private Integer id;
	private String name;
	private String date; //(YYYY/MM/DD)
}
