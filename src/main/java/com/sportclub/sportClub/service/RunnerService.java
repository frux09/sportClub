package com.sportclub.sportClub.service;

import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

import com.sportclub.sportClub.model.Runner;

public interface RunnerService {
	
	Optional<Runner> findById(Integer id);
	
	List<Runner> findAll(Pageable of, String name);
	
	Runner create(Runner runner);
	
	void update(Integer idRuner, Runner runner);
	
	void delete(Integer idRunner);
}
