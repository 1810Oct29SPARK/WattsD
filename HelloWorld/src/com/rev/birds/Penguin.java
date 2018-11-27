package com.rev.birds;

public class Penguin extends Flightless {

	public Penguin() {
		 	
		super();
		String className = this.getClass().getSimpleName();
		System.out.println("Name: " + className);
	}
	public static void main(String[] args) {
		 		
			new Penguin();		
	}

	@Override
	public void Feathers() {
		 
		System.out.println("Feathers: Black and white tuxedo");
	}

	@Override
	public void Eggs() {
		 
		System.out.println("Egg Size: Small eggs");
	}

	@Override
	void Move() {
		 
		System.out.println("Move Type: Swim");
	}

}
