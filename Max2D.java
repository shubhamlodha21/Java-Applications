////////////////////////////////////////////////////////
//Function Name:Max2D
//Input:2 2 (1 2 4 5)
//Output: 5
//Description:Accept 2-D Array from user and return Maximum Number
//Date: 16/06/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;
import Marvellous.Matrix;
class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow,iCol);
	}
	int Maximum()
	{
		int iMax = Arr[0][0];
		for(int i = 0; i< Arr.length; i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				if(Arr[i][j] > iMax)
				{
					iMax = Arr[i][j];
				}
			}
		}
		return iMax;
	}
}
class Max2D
{
	public static void main(String str[])	// From 26th June new PPA batch
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();
		Demo dobj = new Demo(row,col);
		dobj.Accept();
		dobj.Display();
		int ret = dobj.Maximum();
		System.out.println("Maximum is : "+ret);
		System.gc();
	}
}
