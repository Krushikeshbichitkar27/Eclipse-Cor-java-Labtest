package com.Piggie;


//declaring class
public class Addmoney 
{
	static void addMoney(PiggieBank a1)
	{
		+=50;
		
		System.out.println();
	}
	
    //calling main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       PiggieBank a1=new PiggieBank("Krushikesh",50);
       
       System.out.println("Piggie Bank :");
       
       addMoney(a1);
       
       
	}

}
