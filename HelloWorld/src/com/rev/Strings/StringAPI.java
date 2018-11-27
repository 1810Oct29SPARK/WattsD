package com.rev.Strings;

public class StringAPI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Array filled with two string
		String[] str = {"Green", "Blue"};
		
		//Get the length of the array
		System.out.println(str.length);
		
		//Should print the class name
		System.out.println(str.getClass().getName());
		
		//Print out the second member of the array
		System.out.println(str[1].length());
		
		/*str.wait();
		
		System.out.println(str);
		
		str.notify();*/
		//Cloned the array of rings and printed the values
		String[] cloneStr = str.clone();
		
		System.out.println(cloneStr.length);
		
		String str2 = "Red";
		
		System.out.println(str2.lastIndexOf("r"));
		
		str2.trim();
		}
}
