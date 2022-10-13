package com.lab3;

public class TestAccount extends Account
{
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		 Account a1 = new Account();
		 Bank1 b1=new Bank1(a1);
		 Bank2 b2=new Bank2(a1);
		 
		 b1.run();
		 b2.run();
		
		 
	
	

	}	
}
