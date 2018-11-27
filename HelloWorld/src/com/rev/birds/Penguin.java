package com.rev.birds;

public class Penguin extends Flightless {

	public Penguin() {
		// TODO Auto-generated constructor stub	
		super();
		String className = this.getClass().getSimpleName();
		System.out.println(className);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			new Penguin();		
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		super.Eat();
	}

	@Override
	public void Feathers() {
		// TODO Auto-generated method stub
		System.out.println("Black and white tuxedo");
	}

	@Override
	public void Eggs() {
		// TODO Auto-generated method stub
		System.out.println("Smoll eggs");
	}

	@Override
	void Move() {
		// TODO Auto-generated method stub
		System.out.println("Swim");
	}

}
