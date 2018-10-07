package com.sportclub.sportClub.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.sportclub.sportClub.dto.ResultDTO;
import com.sportclub.sportClub.model.Result;

@Component
public class ResultMapperImpl implements ResultMapper{

	@Override
	public Result mapToModel(ResultDTO dto) {
		Result result = new Result();
		
		result.setIdResult(dto.getIdRunner());
		result.setSeconds(dto.getSeconds());
		
		return result;
	}

	@Override
	public ResultDTO mapToDTO(Result model) {
		return ResultDTO.builder()
				.id(model.getIdResult())
				.idRunner(model.getRunner().getIdRunner())
				.seconds(model.getSeconds())
				.build();
	}

	@Override
	public List<ResultDTO> mapToDTO(List<Result> models) {
		return models.parallelStream().map(this::mapToDTO)
				.collect(Collectors.toList());
	}

}
