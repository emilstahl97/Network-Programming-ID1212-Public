package com.kth.server;

/**
 * @author Emil Stahl
 */

/***
 * Plain old Java object that associates a numeric score (integer) with the
 * player who set the score.
 * 
 */

public class BestScore {
	
	private int score;
	private String holder;

	public BestScore(int score, String holder) {
		this.score = score;
		this.holder = holder;
	}

	public int getScore() {
		return score;
	}

	public String getHolder() {
		return holder;
	}
}