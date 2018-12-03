package com.rev.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.rev.auto.Car;

public class SerializeandIODemo {

	public SerializeandIODemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		//transient means ot won't be serialized
		String filename = "src/serializedThings.txt";
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car(2021,"spaceship","Tesla",50));
		carList.add(new Car(1997,"Fiesta","Ford",500));
		carList.add(new Car(1007,"Fancy","Cad",5000));
		for(Car c : carList)
		System.out.println(c);
		
		serializeToFile(filename,carList);
	}
	//serialize an object
	static void serializeToFile(String filename, Object o)
	{
		try {
			FileOutputStream fileOut = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(o);
			out.close();
			fileOut.close();
		}
		catch(FileNotFoundException f)
		{
			f.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	/*static Object deserializeFromFile(String filename)
	{
		Object o = null;
				try {
					FileOutputStream fileOut = new FileOutputStream(filename);
					ObjectOutputStream out = new ObjectOutputStream(fillIn);
					o = in.readObject();
					in.close();
					filein.close();
					catch(FileNotFoundException f{
						f.printStackTrace();
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}
				}
	}*/
}
