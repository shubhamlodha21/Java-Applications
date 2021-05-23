////////////////////////////////////////////////////////
//Function Name:Demo
//Input:--
//Output:--
//Description:Used of Constants in java
//Date: 23/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class Demo
{
	public int i;
	public final int j=20;
	public final float m=99.4f;
}

class FinalC
{
	public static void main(String[] args) 
	{
		Demo obj=new Demo();
		System.out.println("Value of i is"+obj.i);
		System.out.println("Value of j is"+obj.j);
		System.out.println("Value of m is"+obj.m);

	}
}