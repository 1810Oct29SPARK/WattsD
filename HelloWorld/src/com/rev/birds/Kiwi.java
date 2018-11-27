package com.rev.birds;

public class Kiwi extends Flightless {

	public Kiwi() {
		 
		super();
		String className = this.getClass().getSimpleName();
		System.out.println("Name: " + className);
	}

	public static void main(String[] args) {
		 
		new Kiwi();
	}
	@Override
	public void Eat() {
		 
		System.out.println("Diet: Bugs");
	}

	@Override
	public void Feathers() {
		 
		System.out.println("Feathers: Brown/Cocunut");
	}

	@Override
	public void Eggs() {
		 
		System.out.println("Egg Size: Big eggs");
	}

	@Override
	void Move() {
		 
		System.out.println("Move Type: Walks");
	}
}