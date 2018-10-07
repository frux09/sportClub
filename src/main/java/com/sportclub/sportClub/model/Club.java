package com.sportclub.sportClub.model;

import java.util.ArrayList;
import java.util.List;

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
public class Club {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idClub;
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Runner runner;
}
