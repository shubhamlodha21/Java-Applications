////////////////////////////////////////////////////////
//Function Name:Max2D
//Input:2 2 (1 2 4 5)
//Output: 3 9
//Description:Accept Matrix Elements from user return addition of each row
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
	void SummationRow()
	{
		int iSum = 0;
		for(int i = 0; i< Arr.length; i++)
		{
			iSum = 0;
			for(int j = 0; j < Arr[i].length; j++)
			{
				iSum = iSum + Arr[i][j];
			}
			System.out.println("Summation of elements of row no "+ (i+1) +" is : "+iSum);
		}
	}
}
class SumRow2D
{
	public static void main(String str[])	
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();
		Demo dobj = new Demo(row,col);
		dobj.Accept();
		dobj.Display();
		dobj.SummationRow();
		System.gc();
	}
}


























