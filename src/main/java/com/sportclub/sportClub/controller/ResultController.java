package com.sportclub.sportClub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportclub.sportClub.dto.ResultDTO;
import com.sportclub.sportClub.mapper.ResultMapper;
import com.sportclub.sportClub.model.Result;
import com.sportclub.sportClub.service.ResultService;

@RestController
@RequestMapping(value = "/result")
public class ResultController {

	@Autowired
	ResultService resultService;
	@Autowired
	ResultMapper resultMapper;
	
	@PostMapping
	public ResultDTO create(@RequestBody ResultDTO resultToCreate) {
		final Result result = resultMapper.mapToModel(resultToCreate);
		final Result resultCreated = resultService.create(result);
		
		return resultMapper.mapToDTO(resultCreated);
	}
}
