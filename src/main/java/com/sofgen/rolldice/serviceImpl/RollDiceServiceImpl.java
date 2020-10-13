package com.sofgen.rolldice.serviceImpl;

import org.springframework.stereotype.Service;

import com.sofgen.rolldice.entity.RollDice;
import com.sofgen.rolldice.util.RollDices;

@Service
public class RollDiceServiceImpl implements RollDiceService {

	@Override
	public RollDice rollsDice(int pieces, int sides, int rolls) {
		return new RollDice(pieces, sides, rolls, RollDices.dicedResults());
	}
}
