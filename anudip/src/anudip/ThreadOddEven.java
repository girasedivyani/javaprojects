/*Create a Thread to find if the number is odd or even*/
package anudip;

import java.util.Scanner;

public class ThreadOddEven {
	static EvenOdd e=new EvenOdd();
	public static void main(String[] args) {
		
		e.start();//two thread
	}
}
class EvenOdd extends Thread //creating thread using class Thread
{
	public void run()//override run()
	{
		int num;
		//taking input from user
		System.out.println("Enter Number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num%2==0)//print Even if condition is true
		{
			System.out.println("Number is Even");
		}
		else//print Odd if condition is false
		{
			System.out.println("Number is Odd");
		}
	}
}


