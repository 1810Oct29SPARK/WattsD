package com.rev.CodeChallenge;
import java.util.*;
public class StringReverseChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Palindrome is not a Palindrome";
		System.out.println(reverse(str));
	}
	public static String reverse(String string)
	{		
		Stack<Character> stack = new Stack<Character>();
		String reversed = "";
		for(int i = 0; i <string.length();i++)
		{
			char ch = string.charAt(i);
			stack.push(ch);	
		}
		for(int i = 0; i < string.length(); i++)
		{			
			char ch = (Character) stack.pop();	
			reversed = reversed + ch;
		}
		return reversed;
	}
}
