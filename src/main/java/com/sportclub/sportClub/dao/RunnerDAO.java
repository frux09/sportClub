package com.sportclub.sportClub.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportclub.sportClub.model.Runner;

@Repository
public interface RunnerDAO extends JpaRepository<Runner, Integer> {

	Page<Runner> findByNameContaining(String name, Pageable of);

}
