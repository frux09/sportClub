package com.sportclub.sportClub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportclub.sportClub.dao.EventDAO;
import com.sportclub.sportClub.model.Event;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventDAO dao;
	
	@Override 
	public Event create(Event event) {
		return dao.save(event);
	}

}
