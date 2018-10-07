package com.sportclub.sportClub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportclub.sportClub.dao.ClubDAO;
import com.sportclub.sportClub.model.Club;

@Service
public class ClubServiceImpl implements ClubService{

	@Autowired
	ClubDAO dao;
	
	@Override
	public Club create(Club club) {
		return dao.save(club);
	}

}
