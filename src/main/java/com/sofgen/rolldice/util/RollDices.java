package com.sofgen.rolldice.util;

import java.lang.Math;
import java.util.Arrays;

public class RollDices {
	static int numOfPieces[][];
	static int[] diceResults;
	
	public static int[][] rollDice(int pieces, int sides,int rolls) {
		numOfPieces = new int[rolls][pieces];
		diceResults = new int[(sides*pieces)-(pieces-1)];
		int min = 1;
		int range = sides - min + 1;
		int temp;
		int sum;
	
		//numofpiece loop
		for(int i=0;i<rolls;i++) {
			sum = 0;
			for(int j=0;j<pieces;j++) {
				temp = (int)  (Math.random() *range) + min;
				numOfPieces[i][j] = temp;
				
				//total sum of each rolls
				sum = sum + temp;
				if(j == pieces -1) {
					
					//count each results
					for(int k=0;k<diceResults.length;k++) {
						if(sum==k+pieces) {
							diceResults[k] = diceResults[k] + 1;
						}
					}
				}
			}
		}
	return numOfPieces;
	}
	
	public static String dicedResults() {
		return Arrays.toString(diceResults);
	}

}
