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
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Runner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idRunner;
	
	private String name;
	
	private Integer edad;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Club club;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "runner")
	private List<Event> events = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "runner")
	private List<Result> result = new ArrayList<>();
}
