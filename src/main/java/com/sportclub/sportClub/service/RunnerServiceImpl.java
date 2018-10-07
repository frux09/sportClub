package com.sportclub.sportClub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sportclub.sportClub.dao.RunnerDAO;
import com.sportclub.sportClub.model.Runner;

@Service
public class RunnerServiceImpl implements RunnerService {

	@Autowired
	RunnerDAO dao;
	
	@Override
	public Optional<Runner> findById(Integer id) {
		return dao.findById(id);
	}

	@Override 
	public List<Runner> findAll(Pageable of, String name) {
		return dao.findByNameContaining(name, of).getContent();
	}

	@Override
	public Runner create(Runner runner) {
		return dao.save(runner);
	}

	@Override
	public void update(Integer idRuner, Runner runner) {
		dao.saveAndFlush(runner);
		
	}

	@Override
	public void delete(Integer idRunner) {
		dao.deleteById(idRunner);
	}

}
