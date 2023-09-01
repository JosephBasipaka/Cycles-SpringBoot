package com.prodapt.springCycle.Cycle.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cycle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column
	public String name;
	
	@Column
	public Integer borrow = 0;
	
	
	public Cycle() {
		super();
	}


	public Cycle(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer isBorrow() {
		return borrow;
	}


	public void setBorrow(Integer borrow) {
		this.borrow = borrow;
	}
	
	
	
}
