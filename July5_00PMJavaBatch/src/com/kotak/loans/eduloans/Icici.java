package com.kotak.loans.eduloans;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici i = new Icici();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdral from ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit from ICICI");
	}

}
