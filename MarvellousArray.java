////////////////////////////////////////////////////////
//Function Name:MarvellousArray
//Input:10 20 30 40
//Output:10 20 30 40
//Description:Accept Array input from user and display element
//Date: 03/09/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


package Marvellous;

import java.util.*;

public class MarvellousArray
{
	public int Arr[];

	public MarvellousArray(int iSize)
	{
		Arr = new int[iSize];
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter the elements");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}
	public void Display()
	{
		System.out.println("Elements from array are : ");
		for(int i = 0; i < Arr.length; i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
	}
}



































