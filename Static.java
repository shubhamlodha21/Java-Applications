// Description: Implementations of static charcateristics and behaviours
// Date : 02/10/2021
// Author : Shubham Lodha

import java.util.*;

class Demo
{
	public int x,y;
	public static int z=30;

	Demo()
	{
		x=10;
		y=20;
		//z=30; Not Allowed to initailsied static members inside constructor
	}

	public void Fun()
	{
		System.out.println("Inside Fun-Function");
		System.out.println("Value of X is:"+x);
	}

	public static void gun()
	{
		System.out.println("Inside Gun-Function");
		//System.out.println("Value of Y is:"+y);// Non-static members can't be accessed in static method
		System.out.println("Value of Z is:"+z);
	}
}

class Static
{
	public static void main(String[] args) 
	{
		Demo obj=new Demo();

		obj.Fun();
		obj.gun();

	}
}