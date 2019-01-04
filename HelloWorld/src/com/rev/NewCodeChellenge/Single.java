package com.rev.NewCodeChellenge;

public class Single {

	private static Single _instance = null;
	
	public static Single instance()
	{
		if(_instance == null)
		{
			_instance = new Single();
		}
		return _instance;
	}
	public void Dummy()
	{
		System.out.println();
	}
	
}
