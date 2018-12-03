package com.rev.CollectionQuest;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args)
	{
		ArrayList<Integer> example = new ArrayList<Integer>();
		example.add(4);
		example.add(2);
		example.add(8);
		example.add(3);
		example.add(9);
		Iterator<Integer> itern = example.iterator();
		Vector<String> v = new Vector<String>(3,2);
		v.addElement("red");
		v.addElement("blue");
		v.addElement("green");
		v.addElement("yellow");
		
		Iterator<String> itern2 =  v.iterator();
		
		while(itern.hasNext()&&itern2.hasNext())
		{
			System.out.println("next value in array list " + itern.next() + "\n");
			System.out.println("next value in array list " + itern2.next() + "\n");
		}
	}
}
