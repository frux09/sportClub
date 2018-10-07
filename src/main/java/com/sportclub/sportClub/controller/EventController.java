package com.sportclub.sportClub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportclub.sportClub.dto.EventDTO;
import com.sportclub.sportClub.mapper.EventMapper;
import com.sportclub.sportClub.model.Event;
import com.sportclub.sportClub.service.EventService;

@RestController
@RequestMapping(value = "/event")
public class EventController {

	@Autowired
	EventService eventService;
	
	@Autowired
	EventMapper eventMapper;
	
	@PostMapping
	public EventDTO create(@RequestBody EventDTO eventToCreate) {
		final Event event = eventMapper.mapToModel(eventToCreate);
		final Event eventCreated = eventService.create(event);
		
		return eventMapper.mapToDTO(eventCreated);
	}
}
