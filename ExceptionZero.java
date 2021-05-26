////////////////////////////////////////////////////////
//Function Name:ExceptionZero
//Input:1236
//Output:7
//Description:Accept a number from the user if number is zero then throw user defined Exception "Number is 0" other wise calculate the sum of first  last digit of a given number(use static keyword)
//Date: 26/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


import java.util.*;
import java.lang.*;
class MyException extends Exception
{
    MyException()
	{
		super();
	}
	MyException(String str)
	{
		super(str);
	}
	public String getMessage()
	{
		return("Number is 0");
	}
}
class ExceptionZero
{
	static void calc(int n)
	{
		int first=0,last=0;
		if(n<10)
		System.out.println("Sum of first and last digit is "+n);
	    else
	    {
	    	last=n%10;
	    	while(n>0)
	    	{
	    		first=n%10;
	    		n=n/10;
	    	}
	    	System.out.println("Sum of first and last digit is "+(first+last));
	    }

	}
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		try
		{
			if(n==0)
				throw new MyException("Null");
			else
				calc(n);
		}
		catch(MyException e)
		{
			System.out.println("In Exception"+e.getMessage());
		}
		finally
		{
			System.out.println("\n Good bye...");
		}
		
	}
}