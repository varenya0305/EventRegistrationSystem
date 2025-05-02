package com.iorta.sboot.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iorta.sboot.dao.Event;
import com.iorta.sboot.dto.EventDTO;
import com.iorta.sboot.repository.EventRepository;
import com.iorta.sboot.service.EventService;

@Service
public class EventServiceImpl implements EventService{

	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public String createEvent(EventDTO eventDTO) {
		Event event = modelMapper.map(eventDTO, Event.class);
		eventRepository.save(event);
		return "Event created successfully";
	}

	@Override
	public List<EventDTO> getAllEvents() {
		return eventRepository.findAll().stream()
				.map(event -> modelMapper.map(event, EventDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public EventDTO getEventById(Long id) {
		Optional<Event> event = eventRepository.findById(id);
		return event.map(value -> modelMapper.map(value, EventDTO.class)).orElse(null);
	}

	@Override
	public String registerForEvent(Long id, String attendee) {
		Optional<Event> event = eventRepository.findById(id);
		if (event.isPresent()) {
			Event event1 = event.get();
			event1.getAttendees().add(attendee);
			eventRepository.save(event1);
			return "Successfully registered for the event";
		} 
		return "Event not found!";
	}

	
}
