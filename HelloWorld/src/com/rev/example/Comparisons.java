package com.rev.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.rev.Compare.CarMakeCompare;
import com.rev.auto.*;
public class Comparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car(2021,"spaceship","Tesla",50));
		carList.add(new Car(1997,"Fiesta","Ford",500));
		carList.add(new Car(1007,"Fancy","Cad",5000));
		
		System.out.println(carList.get(1).compareTo(carList.get(2)));
		for(Car c : carList)
		System.out.println(c);
		
		//sortWithComparable(carList);
		
		sortWithComparator(carList,new CarMakeCompare());
	}
	static List<Car> sortWithComparable(List<Car> carList){
		Collections.sort(carList);
		for(Car c : carList)
			System.out.println(c);
		return carList;
	}
	static void sortWithComparator(List<Car> carList, Comparator<Car> c)
	{
		Collections.sort(carList, c);
		for(Car car : carList)
			System.out.println(car);
	}
}
