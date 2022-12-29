//Write a program take a input from the age  the user if the age is above 18 print "you are eligible 
//to  vote  else throw an ecepation that age is not correct.
package anudip;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		int age ;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your age");//take input from user
	    age=sc.nextInt();
	    try {
	    
	    	if(age>=18)//pass limitation
	  
		    System.out.println("You are eligible for voting");//beyond limitation user allow
	    	else {
	    		throw new Exception("You are not eligible for voting");//thows exception 
	    	}
	    		
	    	
	    }
	    catch(Exception e)
	    {
	     System.out.println(e);
	    
	    
		   
	    }


	    	
	}

}


