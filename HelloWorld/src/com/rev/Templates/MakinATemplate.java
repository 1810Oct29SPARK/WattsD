package com.rev.Templates;

import java.lang.reflect.Field;
import java.util.Arrays;

import com.rev.auto.Car;
import com.rev.auto.Kayak;

public class MakinATemplate {

	public <T> T findFriend(T t) {
		
		return t;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(2300, "furry roadster","mad max", 1000);
		Object[] emptyCars = replicanteWithGen(c,3);
		((Car) emptyCars[2]).move();
		System.out.println(Arrays.toString(emptyCars));
		funWithReflections();
	}
	static Object[] replicate (Object O, int size)
	{
		Object[] replicant= new Object[size];
		for(int i = 0; i<size;i++)
		{
			replicant[i] = new Object();
		}
		return  replicant;
	}
	static <T> Object[] replicanteWithGen(T t, int size)
	{
		Object[] replicant= new Object[size];
		for(int i = 0; i<size;i++)
		{
			try {
				replicant[i] = (t.getClass().newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return  replicant;
	}
	//time to use a reflection API
	//Allows us to perform a runtime check on a variable's type
	//We can use this to inspcet a class or get its feilds at runti
	static void funWithReflections()
	{
		try {
			Class clazz = Class.forName("com.rev.auto.Kayak");
			System.out.println(clazz.getSimpleName());
			
			//get the feilds of Kayak
			Field[] feilds = clazz.getDeclaredFields();
			System.out.println(Arrays.toString(feilds));
			
			//new instance of Kayak
			try {
				Kayak k = (Kayak) clazz.newInstance();
				Field numSeats = clazz.getDeclaredField("numSeats");
				numSeats.setAccessible(true);
				numSeats.set(k, 5);
				System.out.println(k);
			}
			catch (NoSuchFieldException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
}



	
