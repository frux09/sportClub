package com.sportclub.sportClub.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.sportclub.sportClub.dto.ClubDTO;
import com.sportclub.sportClub.model.Club;

@Component
public class ClubMapperImpl implements ClubMapper{

	@Override
	public Club mapToModel(ClubDTO dto) {
		Club club = new Club();
		
		club.setIdClub(dto.getId());
		club.setName(dto.getName());
		
		return club;
	}

	@Override
	public ClubDTO mapToDTO(Club model) {
		return ClubDTO.builder()
				.id(model.getIdClub())
				.name(model.getName())
				.build();
	}

	@Override
	public List<ClubDTO> mapToDTO(List<Club> models) {
		return models.parallelStream().map(this::mapToDTO)
				.collect(Collectors.toList());
	}

}
