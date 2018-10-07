package com.sportclub.sportClub.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import com.sportclub.sportClub.model.Result;

public interface ResultService {

	Result create(Result result);
	
	Optional<Result> findById(Integer id);

	//Este va a ser el Algoritmo complejo, revisar cabecera
	List<Result> findAllResultByRunner(Pageable of, Integer idRunner);
}
