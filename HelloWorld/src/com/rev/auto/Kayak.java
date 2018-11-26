package com.rev.auto;

public class Kayak extends Boat {

	public Kayak(Color color, double hullSize, int numSeats, double paddleLength, Fuel fuel) {
		super(color, hullSize, fuel);
		this.numSeats = numSeats;
		this.paddleLength = paddleLength;
		this.setColor(color);
		this.setHullSize(hullSize);
	}

	public Kayak(Color color, double hullSize, Fuel fuel) {
		super(color, hullSize, fuel);
	}

	public Kayak() {
	}
	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	public double getPaddleLength() {
		return paddleLength;
	}

	public void setPaddleLength(double paddleLength) {
		this.paddleLength = paddleLength;
	}
	private int numSeats;
	private double paddleLength;
	@Override
	public String toString() {
		return "Kayak [numSeats=" + numSeats + ", paddleLength=" + paddleLength + ", Color=" + color +", Fuel= "+ fuel + "]";
	}

}
