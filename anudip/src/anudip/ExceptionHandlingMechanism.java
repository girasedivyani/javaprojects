/*Write down a program where you take input 2 numbers (i,j)the user and divide the first number with second .include exception handling mechanism*/


package anudip;

import java.util.Scanner;

 class ExceptionHandlingMechanism {
	public static void main(String args[])
	{
		int i,j;
			try
			{
				Scanner sc=new Scanner(System.in); //taking input from the user
				System.out.println("enter the first number");
				i=sc.nextInt(); //pass the first value
				System.out.println("enter the second number");
				j=sc.nextInt();  //pass the second value
				System.out.println(i/j);   //print the calculation
			}
			catch(Exception e)
			{
				System.out.println(e);  //print exception
			}
			System.out.println("end");
				
	}

}


