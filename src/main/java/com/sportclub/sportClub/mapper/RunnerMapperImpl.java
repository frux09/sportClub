package com.sportclub.sportClub.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.sportclub.sportClub.dto.RunnerDTO;
import com.sportclub.sportClub.model.Runner;

@Component
public class RunnerMapperImpl implements RunnerMapper {

	@Override
	public Runner mapToModel(RunnerDTO dto) {
		final Runner runner = new Runner();
		
		runner.setIdRunner(dto.getId());
		runner.setName(dto.getName());
		runner.setEdad(dto.getYear());
		
		return runner;
	}

	@Override
	public RunnerDTO mapToDTO(Runner model) {
		return RunnerDTO.builder()
				.id(model.getIdRunner())
				.name(model.getName())
				.year(model.getEdad())
				.build();
	}

	@Override
	public List<RunnerDTO> mapToDTO(List<Runner> models) {
		return models.parallelStream().map(this::mapToDTO)
				.collect(Collectors.toList());
	}

}
