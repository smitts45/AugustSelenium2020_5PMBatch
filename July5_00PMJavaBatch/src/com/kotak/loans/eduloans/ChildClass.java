package com.kotak.loans.eduloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) 
	{		
		ChildClass c = new ChildClass();
		c.m1();
		c.m2();
	}
	
	public void m1()
	{
		System.out.println("iam m1 concrete from ChildClass...");
	}
	

	@Override
	public void m2() 
	{
		System.out.println("iam m2 overriden from ChildClass....");
	}

}
