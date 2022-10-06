package com.Question2;

//declaring class
public class BufferPerformance 
{
	
    //calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		long sbpTime = System.currentTimeMillis(); //Returns the current time in milliseconds
		StringBuffer sp = new StringBuffer("krushikesh");
		
		 //condition given using for loop
		for (int i = 0; i < 2000000; i++) 
		{
			sp.append('k');
		}

		long timeTake = System.currentTimeMillis() - sbpTime;

		System.out.println("Time take to StringBuffer:" + timeTake);

		sbpTime = System.currentTimeMillis();  //Returns the current time in milliseconds
		StringBuilder sp2 = new StringBuilder("krushikesh");
		
         //condition given using for loop
		for (int i = 0; i < 30000000; i++) 
		{
			sp2.append('e');
		}

		timeTake = System.currentTimeMillis() - sbpTime;

		System.out.println("Time take to StringBuilder:" + timeTake);

	}

	}


