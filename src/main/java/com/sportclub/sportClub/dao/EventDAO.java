package com.sportclub.sportClub.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportclub.sportClub.model.Event;

public interface EventDAO extends JpaRepository<Event, Integer> {

}
