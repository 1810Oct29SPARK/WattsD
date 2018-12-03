package com.rev.ArrayForFun;
import java.util.*;

import java.util.function.IntBinaryOperator;

import com.rev.auto.Vehicle;
public class ArraysForFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funWithString();
		funWithArrays();
	}
	static void funWithString()
	{
		String a = "hello world";
		String b = new String("Hello");
		
		if(a== b)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		//== compares primitives or checks whether to objects are the same objects
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.trim());
		System.out.println(a.substring(3));
		System.out.println(a.concat(b));
		System.out.println(a.replace('l', 'r'));
		System.out.println(a.indexOf('l'));
	}
	static void funWithArrays() {
		String[] arr1 = {"this","is","an","array"};
		String[] arr2 = new String[4];
		for(int i = 0; i <arr2.length;i++)
		{
			arr2[i] = "element" + i;
		}
		System.out.println(arr2.length);
		int[][] arr3 = new int[4][3];
		for(String s : arr1) {
			System.out.println(s);
		}
		arr3[0][0] = 7;
		arr3[0][2] = 8;
		arr3[3][0] = 9;
		arr3[3][2] = 10;
		
		for(int[] a : arr3)
		{
			System.out.println(Arrays.toString(a));
		}
		Vehicle[] vehicles = new Vehicle[4];
		System.out.println(Arrays.toString(vehicles));
		int[] arr = {2,1,3,4,6,1,7,3,6,8,9,2,4};
		IntBinaryOperator op = (x,y) -> x+y;
		Arrays.parallelPrefix(arr, op);
		//Arrays.parallelPrefix(arr, (x,y) -> compute(x,y));
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
		}
	}
	

