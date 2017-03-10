package com.skimina.model;

public class Dice {
	public enum Eyes {
		ONE, TWO, THREE, FOUR, FIVE, SIX;
	}

	private Eyes eyes;

	public Dice() {
		this.setEyes(Eyes.ONE);
	}

	public Eyes getEyes() {
		return eyes;
	}

	public void setEyes(Eyes eyes) {
		this.eyes = eyes;
	}

}
