package com.sportclub.sportClub.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idResult;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Runner runner;
	
	private Integer seconds;
	
}
