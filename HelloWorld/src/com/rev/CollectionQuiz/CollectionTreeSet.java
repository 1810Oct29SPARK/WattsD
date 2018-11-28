package com.rev.CollectionQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class CollectionTreeSet {

	
	public static void main(String[] args)
	{
		TreeSet<String> trees = new TreeSet<String>();
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("thrid");
		trees.add("blue1");
		trees.add("blue2");
		trees.add("Blue");
		System.out.println(list);
		
		System.out.println(trees);
		System.out.println(trees.size());
		list = trees.clone().getClass();
		trees.add(null);
		System.out.println(trees);
	}
}
