package com.iorta.sboot.dto;

import java.time.LocalDate;
import java.util.List;

public class EventDTO {
	private Long id;
	private String eventName;
	private String description;
	private LocalDate eventDate;
	private List<String> attendees;
	
	public EventDTO() {}
	
	public EventDTO(Long id, String eventName, String description, LocalDate eventDate,
			List<String> attendees) {
		this.id = id;
		this.eventName = eventName;
		this.description = description;
		this.eventDate = eventDate;
		this.attendees = attendees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public List<String> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<String> attendees) {
		this.attendees = attendees;
	}

}
