package Chapter14;


import java.lang.System;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class TheRace {
	private int one;
	private int two;
	private int oneCount;
	private int twoCount;
	private int[] track = new int[18];
	private int turn;
	private int winner;

	public TheRace() {
		one = 0; two = 0; oneCount = 0; twoCount = 0; turn = 1; winner = 0;
		track[one] = 1;
		track[two] = 2;
	}

	public boolean turn() {
		if (oneCount != 5 && twoCount != 5) {
			
			if(turn%2 == 1) {
				//number ones turn
				track[one] = 0;
				one = (int) (one + (Math.random() * 9));
				if(one > 17) {
					one -= 18;
					oneCount++;
					
				}
				if(one == two) {
					one = 0;
				}
			
				track[one] = 1;
				
				
			}else {
				//number twos turn
				track[two] = 0;
				two = (int)(two + (Math.random() * 9));
				if(two > 17) {
					two -= 18;
					twoCount++;
					
				}
				if(two == one) {
					two = 0;
				}
				
				track[two] = 2;
				
			}
			turn++;
			return true;
		}
		return false;
	}

	public String getWinner() {
		if(oneCount > twoCount) {
			return "1";
		}
		return "2";
	}

	public String toString() {
		return Arrays.toString(track) + " one count = " + oneCount + " twoCount = " + twoCount;
	}
}