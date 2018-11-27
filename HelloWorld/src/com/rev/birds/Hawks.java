package com.rev.birds;

public class Hawks extends BirdsofPrey {

	public Hawks() {
		 
		super();
		String className = this.getClass().getSimpleName();
		System.out.println(className);
	}
	public static void main(String[] args) {
		 
		new Hawks();
	}
	@Override
	public void Eat() {
		 
		super.Eat();
	}

	@Override
	public void Feathers() {
		 
		System.out.println("Feathers: Grey");
	}

	@Override
	public void Eggs() {
		 
		super.Eggs();
	}

	@Override
	void Fly() {
		 
		System.out.println("Move Type: Not Floating Flying");
	}

}
