package com.lab1;

public class LambdaThreadExpression 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Thread Example without Lambda
		Runnable b1=new Runnable()
				{
			public void run()
			{
				System.out.println(Thread.currentThread().getName()+": Task1 is running");
			}
			
				};
				
				Thread t1=new Thread(b1,"Krushikesh");
				System.out.println(".-.-.-Withoput Lambda-.-.-.");
				t1.start();
				//thread example with lambda
				Runnable b2=()->{
					System.out.println(Thread.currentThread().getName()+" : Task 2 is running");
				};
				Thread t2=new Thread(b2,"Pooja");
				System.out.println(".-.-.-With Lambda-.-.-.");
				t2.start();

	}

}
