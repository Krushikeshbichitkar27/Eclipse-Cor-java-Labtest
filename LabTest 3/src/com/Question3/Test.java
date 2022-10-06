package com.Question3;


//declaring class
public class Test 
{
	static void display(Student s)
	{
		  
	System.out.println("Student Name:" + s.getName());
	System.out.println("Standard:" + s.getStandard()); 
	System.out.println("Avargae Marks :" + s.getAvgMarks());
	       
	System.out.println(s);
	}
    //calling main method
	public static void main(String...args) 
	{
		// TODO Auto-generated method stub
		Student s1 = new Student("Krushikesh",12,75.09f);
		Student s2 = new Student("Pooja",10,79.09f);
		Student s3 = new Student("Raj",10,85.09f);
		Student s4 = new Student("Swati",12,69.09f);

		System.out.println("Details are:");

		display(s1);
		display(s2);
		display(s3);
		display(s4);
		
	}

}
