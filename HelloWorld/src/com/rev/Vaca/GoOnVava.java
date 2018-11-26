package com.rev.Vaca;

import com.rev.auto.Car;
import com.rev.auto.Kayak;
import com.rev.auto.Motercycle;
import com.rev.auto.Vehicle;
import com.rev.auto.Vehicle.*;
import com.rev.example.Hello;
import java.io.*;

public class GoOnVava implements Serializable{
	private static final long serialVersionUID = -6212017074406191463L;

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
		Kayak k = new Kayak(Color.Blue, 4.2, 2, 2, Fuel.Human_Suffering);
		System.out.println(k);
		System.out.println("Moving at " + k.move() + " miles per hour");
	}
	static Vehicle chooseAVehicle(Vehicle[] garage) {
		Vehicle choice = null;
		Vehicle[] vehicles = {new Kayak(Color.Red,4.2,3,6,Fuel.Hopes_Dreams), new Car(2012, "SpaceShip", "Tesla",50), new Motercycle(Color.Blue, Fuel.Human_Suffering)};
		for(int i = 0;i<garage.length; i++)
		{
			
		}
		return choice;
	}
}
