package com.Question3;

//declaring class
public class BookDetails 
{
	//creating display method
	static void display(Book b1) 
	{
	System.out.println(b1);	
	}
	
	
	//calling main method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Book b1= new Book("Wings of Fires",199.9,new Author("A.P.J Abdul Kalam", 1999,"Universities Press"));
		Book b2= new Book("Mastering Hacking",199.9,new Author("Harsh Bothra", 2019,"Khanna Book Publishing"));
	     System.out.println("Book Deatails :");
	     
	     display(b1);
	     display(b2);
		
	}

}
