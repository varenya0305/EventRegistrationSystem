package com.iorta.sboot.service;

import java.util.List;

import com.iorta.sboot.dto.EventDTO;

public interface EventService {
	
	String createEvent(EventDTO eventDTO);

	List<EventDTO> getAllEvents();

	EventDTO getEventById(Long id);

	String registerForEvent(Long id, String attendee);

}
