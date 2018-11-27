package com.rev.birds;

public class Parrot extends Domestic {

	public Parrot() {
		// TODO Auto-generated constructor stub
		super();
		String className = this.getClass().getSimpleName();
		System.out.println(className);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Parrot();
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		super.Eat();
	}

	@Override
	public void Feathers() {
		// TODO Auto-generated method stub
		System.out.println("Rainbow feathers");
	}

	@Override
	public void Eggs() {
		// TODO Auto-generated method stub
		super.Eggs();
	}

	@Override
	void Fly() {
		// TODO Auto-generated method stub
		System.out.println("I believe it can fly");
	}

}
