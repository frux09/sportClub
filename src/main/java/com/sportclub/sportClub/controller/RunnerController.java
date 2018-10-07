package com.sportclub.sportClub.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sportclub.sportClub.dto.RunnerDTO;
import com.sportclub.sportClub.mapper.RunnerMapper;
import com.sportclub.sportClub.model.Runner;
import com.sportclub.sportClub.service.RunnerService;

@RestController
@RequestMapping(value = "/runner")
public class RunnerController {

	@Autowired
	RunnerService runnerService;
	
	@Autowired
	RunnerMapper runnerMapper;
	
	@GetMapping("/{idRunner}")
	public RunnerDTO findById(@PathVariable Integer idRunner) {
		final Optional<Runner> runner = runnerService.findById(idRunner);
		
		return runnerMapper.mapToDTO(runner.get());
	}
	
	@GetMapping
	public List<RunnerDTO> findAll(
			@RequestParam(defaultValue = "0", value = "page", required = false) Integer page,
			@RequestParam(defaultValue = "4", value = "size", required = false) Integer size,
			@RequestParam(value = "name", required = false) String name) {
		final List<Runner> runners = runnerService.findAll(PageRequest.of(page, size),
				name);
		return runnerMapper.mapToDTO(runners);
	}
	
	@PostMapping
	public RunnerDTO create(@RequestBody RunnerDTO runnerToCreate) {
		final Runner runner = runnerMapper.mapToModel(runnerToCreate);
		final Runner runnerCreated = runnerService.create(runner);
		
		return runnerMapper.mapToDTO(runnerCreated);
	}
	
	@PutMapping("/{idRunner}")
	public void update(@RequestBody RunnerDTO runnerToUpdate, 
					   @PathVariable Integer idRunner) {
		final Runner runner = runnerMapper.mapToModel(runnerToUpdate);
		runner.setIdRunner(idRunner);
		runnerService.update(idRunner, runner);
	}
	
	@DeleteMapping("/{idRunner}")
	public void delete(@PathVariable Integer idRunner) {
		runnerService.delete(idRunner);
	}
}
