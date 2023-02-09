package com.JDBCLibrary.LibraryProject;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void Insertion()
	{
		System.out.println("Insert the data you want!!");
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Divyani@123");
			if(con.isClosed())
			{
				System.out.println("The connection is close");
			}
			else
			{
				System.out.println("The connection is established");
			}
			String q="Insert into college_library1(prn_no,dename,bookname,phone_no,usedday) values(?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			
		//INSERT RECORD USING SCANNER
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the PRN_NO: ");
			int prn=sc.nextInt();
			System.out.println("Enter the Department Name: ");
			String dename=sc.next();
			System.out.println("Enter the Book Name: ");
			String bookname=sc.next();
			System.out.println("Enter the Phone Number: ");
			int phone_no=sc.nextInt();
			System.out.println("Enter the how many days you want: ");
			int usedday=sc.nextInt();
			
			pstmt.setInt(1, prn);
			pstmt.setString(2,dename);
			pstmt.setString(3, bookname);
			pstmt.setInt(4, phone_no);
			pstmt.setInt(5, usedday);
			
			//EXECUTE THE QUERY
			pstmt.executeUpdate();
			System.out.println("Congratulation !!!");
			System.out.println("Your data insert successfully !!!");
			
			//CLOSE THE CONNECTION
			con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void Updation()
	{
		System.out.println("Update the data you want!!");
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Divyani@123");
			if(con.isClosed())
			{
				System.out.println("The connection is close");
			}
			else
			{
				System.out.println("The connection is established");
			}
			String q="update  college_library1 set bookname=? , usedday=?  where prn_no=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			
		//INSERT RECORD USING SCANNER
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the PRN_NO: ");
			int prn_no=sc.nextInt();
			System.out.println("Enter the Book Name: ");
			String bookname=sc.next();
			System.out.println("Enter the how many days you want: ");
			int usedday=sc.nextInt();
			
			
			pstmt.setString(1, bookname);
			pstmt.setInt(2, usedday);
			pstmt.setInt(3, prn_no);
			
			
			//EXECUTE THE QUERY
			pstmt.executeUpdate();
			System.out.println("Congratulation !!!");
			System.out.println("Your data updated successfully !!!");
			
			//CLOSE THE CONNECTION
			con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void Deletion()
	{
		System.out.println("Delete the data you want!!");
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Divyani@123");
			if(con.isClosed())
			{
				System.out.println("The connection is close");
			}
			else
			{
				System.out.println("The connection is established");
			}
			String q="Delete from college_library1 where prn_no=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			
		//INSERT RECORD USING SCANNER
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the PRN_NO: ");
			int prn_no=sc.nextInt();
			
			
			pstmt.setInt(1, prn_no);
			
			
			//EXECUTE THE QUERY
			pstmt.executeUpdate();
			
			System.out.println("Your data deleted successfully !!!");
			
			//CLOSE THE CONNECTION
			con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void Display()
	{
		System.out.println("Display the data!!");
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Divyani@123");
			if(con.isClosed())
			{
				System.out.println("The connection is close");
			}
			else
			{
				System.out.println("The connection is established");
			}
			
			//DISPLAY ALL THE RECORD
			String q="Select prn_no,dename,bookname,phone_no,usedday from college_library1";
			PreparedStatement pstmt=con.prepareStatement(q);
            ResultSet rset=pstmt.executeQuery();
    		
    		while(rset.next())
    		{
    			int prn_no=rset.getInt(1);
    			String dename=rset.getString(2);
    			String bookname=rset.getString(3);
    			int phone_no=rset.getInt(4);
    			int usedday=rset.getInt(5);
    			System.out.println("PRN_NO: "+prn_no+" "+"Department Name: "+dename+" "+"Book Name: "+bookname+" "+"Phone_No: "+phone_no);
    		}
			
		
			
			
			
			
			
			
			//CLOSE THE CONNECTION
			con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	 public static void main( String[] args )
	    {
	      //  System.out.println( "Hello World!" );
	    	
	    	{
	    	
	    	   Scanner sc= new Scanner(System.in);
	    	   System.out.println("Choose which operation do you want perform : ");
	    	   System.out.println("1 : Insertion, 2 : Updation, 3 : Deletion, 4 : Display");
	    	   int a=sc.nextInt();
	    	   
	    	   switch(a)
	    	   {
	    	   case 1: Insertion();
	    	   break;
	    	   
	    	   case 2: Updation();
	    	   break;
	    	   
	    	   case 3: Deletion();
	    	   break;
	    	   
	    	   case 4: Display();
	    	   break;
	    	   }
	    	 }
	    	
	    
	    	
	    }
		
		
}



/*/**
 * Hello world!
 *
 */
//public class App 

   // public static void main( String[] args )
    /*{
        System.out.println( "Hello World!" );
    }*/

