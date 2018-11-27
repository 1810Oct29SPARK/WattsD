package com.rev.birds;

public class Hawks extends BirdsofPrey {

	public Hawks() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hawks();
	}
	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		super.Eat();
	}

	@Override
	public void Feathers() {
		// TODO Auto-generated method stub
		System.out.println("Grey");
	}

	@Override
	public void Eggs() {
		// TODO Auto-generated method stub
		super.Eggs();
	}

	@Override
	void Fly() {
		// TODO Auto-generated method stub
		System.out.println("Not Floating Flying");
	}

}
