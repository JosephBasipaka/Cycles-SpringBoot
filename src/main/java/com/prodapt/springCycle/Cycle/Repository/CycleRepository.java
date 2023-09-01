package com.prodapt.springCycle.Cycle.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.springCycle.Cycle.Entity.Cycle;

@Repository
public interface CycleRepository extends CrudRepository<Cycle, Integer>{
	
}