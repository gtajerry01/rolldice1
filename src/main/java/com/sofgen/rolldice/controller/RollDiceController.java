package com.sofgen.rolldice.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sofgen.rolldice.entity.RollDice;
import com.sofgen.rolldice.repository.RollDiceRepository;
import com.sofgen.rolldice.serviceImpl.RollDiceService;

@RestController
public class RollDiceController {

	@Autowired
	private RollDiceService rdService;
	
	@Autowired
	private RollDiceRepository rdRepository;

	@GetMapping("/rollDice/{pc}/{sides}/{rolls}")
	public RollDice rollsDicesAndSides(@Valid @PathVariable int pc, 
			@Valid @PathVariable int sides, @Valid @PathVariable int rolls) {
		return rdService.rollsDice(pc,sides, rolls);
	}
	
	@GetMapping("/getRolledDice/")
	public String getRolledDice() {
		List<RollDice> rd = rdRepository.findAll();
		int rolls = rd.stream().mapToInt(obj -> obj.getRolls()).sum();
		String res = "Rolls: " + rolls + "\n" + "Simulations: " + rd.size() + "\n";
		
		return res;
	}
	
	@PostMapping("/saveRolledDice/{pc}/{sides}/{rolls}")
	public void rollsDicesAndSidesStore(@Valid @PathVariable int pc, 
			@Valid @PathVariable int sides, @Valid @PathVariable int rolls) {
		rdRepository.save(rdService.rollsDice(pc,sides, rolls));
	}
}
