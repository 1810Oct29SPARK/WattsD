package com.rev.example;

import java.util.*;

public class Hello {

	public static Hello _instance = new Hello();

	private Hello() {
	}

	public static Hello getInstance() {
		if (_instance == null)
			_instance = new Hello();

		return _instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));

		String s = "5";
		Double d = Double.parseDouble(s);
		System.out.println(d.getClass());
		// fizzBuzz this\
		List<Integer> num = new ArrayList<Integer>();
		num.add(0, 2);
		num.add(1, 4);

		System.out.println(num);
		state = State.hide;
		System.out.println(state);
		System.out.println("");
		ForLoop();
		System.out.println("");
		WhileLoop();
		System.out.println("");
		SwitchCases();
	}

	public enum State {
		walk, run, hide, none
	}

	public static State state;

	public static void ForLoop() {
		for (int i = 0; i < 20; i++)
			if (i % 2 == 0) {
				System.out.println(i);
			}
	}

	static void WhileLoop() {
		int i = 0;
		do {
			i++;
			System.out.println("Infinite power");
			if (i > 2)
				break;
		} while (true);
	}

	static void SwitchCases() {
		Practicenum day = Practicenum.Sunday;

		switch (day) {
		case Sunday:
			System.out.println("Today is Sunday");
			break;
		case Monday:
			System.out.println("Today is Monday");
			break;
		case Tuesday:
			System.out.println("Today is Tuesday");
			break;
		case Wednsday:
			System.out.println("Today is Wedsday");
			break;
		case Thursday:
			System.out.println("Today is Thursday");
			break;
		case Friday:
			System.out.println("Today is Friday");
			break;
		case Saturday:
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("Today is a Day");
			break;
		}
	}
}
