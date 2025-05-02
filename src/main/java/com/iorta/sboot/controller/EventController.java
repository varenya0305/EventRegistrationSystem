package com.iorta.sboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iorta.sboot.dto.EventDTO;
import com.iorta.sboot.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@PostMapping("/createEvent")
	public String createEvent(@RequestBody EventDTO eventDTO) {
		return eventService.createEvent(eventDTO);
	}
	
	@GetMapping("/getAllEvents")
	public List<EventDTO> getAllEvents() {
		return eventService.getAllEvents();
	}
	
	@GetMapping("/getEventById/{id}")
	public EventDTO getEventById(@PathVariable Long id) {
		return eventService.getEventById(id);
	}
	
	@PostMapping("/registerForEvent/{id}")
	public String registerForEvent(@PathVariable Long id, @RequestParam String attendee) {
		return eventService.registerForEvent(id, attendee);
	}

}
