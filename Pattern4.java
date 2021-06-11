////////////////////////////////////////////////////////
//Function Name:Pattern
//Input: 5  5 
//Output:
/*
1 1 1 1 1
3 _ _ _ 3
5 _ _ _ 5
7 _ _ _ 7
9 9 9 9 9*/

//Description:Print the Pattern
//Date: 11/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;


class Pattern
{
	void Display(int iRow, int iCol)
	{
		int no = 1;
		for(int i = 1; i <= iRow; i++)
		{
			for(int j = 1; j<=iCol; j++)
			{
				if((i == 1) || (j == 1) || (i == iRow) || (j == iCol))
				{
					System.out.print(no+"\t");
				}
				else
				{
					System.out.print(" \t");
				}
			}
			no = no + 2;
			System.out.println();
		}
	}
}

class Pattern4
{
	public static void main(String arg[])
	{
		int no1,no2;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of rows");
		no1 = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		no2 = sobj.nextInt();
		
		Pattern pobj = new Pattern();
		pobj.Display(no1,no2);
	}
}