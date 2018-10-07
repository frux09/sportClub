package com.sportclub.sportClub.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.sportclub.sportClub.dto.EventDTO;
import com.sportclub.sportClub.model.Event;

@Component
public class EventMapperImpl implements EventMapper{

	@Override
	public Event mapToModel(EventDTO dto) {
		
		Event event = new Event();
		
		event.setIdEvent(dto.getId());
		event.setName(dto.getName());
		event.setDate(dto.getDate());
		
		return event;
	}

	@Override
	public EventDTO mapToDTO(Event model) {
		return EventDTO.builder()
				.id(model.getIdEvent())
				.name(model.getName())
				.date(model.getDate())
				.build();
	}

	@Override
	public List<EventDTO> mapToDTO(List<Event> models) {
		return models.parallelStream().map(this::mapToDTO)
				.collect(Collectors.toList());
	}

}
