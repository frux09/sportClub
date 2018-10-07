package com.sportclub.sportClub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportclub.sportClub.dto.ClubDTO;
import com.sportclub.sportClub.mapper.ClubMapper;
import com.sportclub.sportClub.model.Club;
import com.sportclub.sportClub.service.ClubService;

@RestController
@RequestMapping(value = "/club")
public class ClubController {

	@Autowired
	ClubService clubService;
	
	@Autowired
	ClubMapper clubMapper;
	
	@PostMapping
	public ClubDTO create(@RequestBody ClubDTO clubToCreate) {
		final Club club = clubMapper.mapToModel(clubToCreate);
		final Club clubCreated = clubService.create(club);
		
		return clubMapper.mapToDTO(clubCreated);
	}
}
