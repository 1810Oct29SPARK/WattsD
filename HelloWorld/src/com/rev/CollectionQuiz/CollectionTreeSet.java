package com.rev.CollectionQuiz;

import java.util.TreeSet;

public class CollectionTreeSet {

	
	public static void main(String[] args)
	{
		TreeSet<String> trees = new TreeSet<String>();
		trees.add("blue1");
		trees.add("blue2");
		trees.add("Violet");
		trees.add("blue6");
		trees.add("Blue");
		
		//Natural order of the tree set
		System.out.println(trees+"\n");
		//Size fo the tree set, how many elements
		System.out.println(trees.size()+"\n");
		//This will show us if the tree set is empty or not
		System.out.println(trees.isEmpty()+"\n");
		
		trees.pollFirst();
				
		trees.pollLast();
		
		System.out.println(trees + "\n");
		
		System.out.println(trees.ceiling("blue") + "\n");
		trees.add(null);
		System.out.println(trees);
	}
}
