package com.Question1;
//importing Scanner 
import java.util.Scanner;

//declaring class
public class PalindromDemo 
{
	    //creating method
		static boolean showPalindrome(String str)
		{
			boolean status;
			char ch[]=str.toCharArray();  // converts the given string into a sequence of characters.
			String revstrString =" ";
			//giving condition using for loop
			for(int i=str.length()-1;i>=0;i-- ) 
			{
				revstrString+= ch[i];
			}
			int flag= str.compareTo(revstrString); // reference matching
			if(flag==0) 
				status= true;
			else
				status= false;
			
			return status;
		}
    //calling main method
	public static void main(String...args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  String  :");
		String p =sc.next();
		boolean show = showPalindrome(p);
		if(show)
		{
			System.out.println("----The String is a palindrom----");
		}
		else
			System.out.println("----The String is not a palindrom----");
		sc.close();

	}

}
