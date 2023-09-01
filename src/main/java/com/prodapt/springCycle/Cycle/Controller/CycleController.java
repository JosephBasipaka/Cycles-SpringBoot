package com.prodapt.springCycle.Cycle.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prodapt.springCycle.Cycle.Entity.Cycle;
import com.prodapt.springCycle.Cycle.Repository.CycleRepository;

@Controller
public class CycleController {
	
	private List<Cycle> cycles = new ArrayList<>();

	@Autowired
	private CycleRepository cycleRepository;
	
	@GetMapping("/Cycle")
	public String get(Model model) {
		cycles = (List<Cycle>) cycleRepository.findAll();
		model.addAttribute("cycles" , cycles);
//		model.addAttribute("new_Cycle",new Cycle());
		return "Cycle";
	}
	
	
	@GetMapping("/borrow/{id}")
public String borrow(@PathVariable int id) {
    Cycle cycle = cycleRepository.findById(id).orElse(null);
    if (cycle != null) {
        cycle.setBorrow(1);
        cycleRepository.save(cycle);
    }
    return "redirect:/Cycle"; 
}

	@GetMapping("/return/{id}")
	public String returnCycle(@PathVariable int id) {
	    Cycle cycle = cycleRepository.findById(id).orElse(null);
	    if (cycle != null) {
	        cycle.setBorrow(0);
	        cycleRepository.save(cycle);
	    }
	    return "redirect:/Cycle";
	}

//		@PostMapping("/add")
//		public String addStudent(@ModelAttribute Cycle cycle) {
//			cycleRepository.save(cycle);
//			return "redirect:/Cycle";
//		}
		}

