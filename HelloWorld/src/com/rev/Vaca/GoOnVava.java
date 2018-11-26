package com.rev.Vaca;

import com.rev.auto.Car;
import com.rev.auto.Kayak;
import com.rev.auto.Vehicle.Color;
import com.rev.auto.Vehicle.Fuel;
import com.rev.example.Hello;

public class GoOnVava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets go to Miami");
		System.out.println("we need a car");
		Hello.ForLoop();
		Car c = new Car(2021, "Spaceship", "Tesla", 50);
		System.out.println(c);
		System.out.println("Do we need to change the oil first?");
		if (Car.milesBetweenChanges <= c.getMilesSinceOilChange()) {
			System.out.println("Stahp");
		} else {
			System.out.println("Your good");
		}
		System.out.println("Made it to miami, lets go Kayaking");
		Kayak k = new Kayak(Color.Blue,4.2,2,2,Fuel.Human_Suffering);
		System.out.println(k);
	}
}
