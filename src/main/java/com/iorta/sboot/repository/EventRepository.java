package com.iorta.sboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iorta.sboot.dao.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
