////////////////////////////////////////////////////////
//Function Name:MaxRow2D
//Input:2 2 (1 2 4 5)
//Output: 2  5
//Description:Accept Matrix Elements from user return Maximum of each row
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
	void MaximumRow()
	{
		int iMax = 0;
		for(int i = 0; i< Arr.length; i++)
		{
			iMax = Arr[i][0];
			for(int j = 0; j < Arr[i].length; j++)
			{
				if(Arr[i][j] > iMax)
				{
					iMax = Arr[i][j];
				}
			}
			System.out.println("Maximum element of row no "+ (i+1) +" is : "+iMax );
		}
	}
}
class MaxRow2D
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
		dobj.MaximumRow();
		System.gc();
	}
}
