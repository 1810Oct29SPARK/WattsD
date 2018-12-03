package com.rev.Compare;

import java.util.Comparator;

import com.rev.auto.Car;

public class CarModelCompare implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o2.getModel().compareTo(o2.getModel());
	}

}
