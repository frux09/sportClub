package com.sportclub.sportClub.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportclub.sportClub.dao.ResultDAO;
import com.sportclub.sportClub.model.Result;

@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	ResultDAO dao;
	
	@Autowired
	RunnerService runnerService;
	
	@Override
	public Result create(Result result) {
		return dao.save(result);
	}

	@Override
	public Optional<Result> findById(Integer id) {
		return dao.findById(id);
	}

	@Override //ESTA ES EL ALGORITMO COMPLEJO CAMBIAR
	public List<Result> findAllResultByRunner(Pageable of, Integer idRunner) {
		// TODO Auto-generated method stub
		return null;
	}

}
