package com.sofgen.rolldice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class RollDice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Min(1)
	private int pieces = 0;
	
	@NotNull
	@Min(4)
	private int sides = 0;
	
	@NotNull
	@Min(1)
	private int rolls = 0;
	
	private String count;
	
	public RollDice() {
		
	}
	
	public RollDice(int pieces, int sides, int rolls, String count) {
		this.pieces = pieces;
		this.sides = sides;
		this.rolls = rolls;
		this.count = count;
	}
	
	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getRolls() {
		return rolls;
	}

	public void setRolls(int rolls) {
		this.rolls = rolls;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}


}
