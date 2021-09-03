////////////////////////////////////////////////////////
//Function Name:DiagonalAdd
//Input:10 20 30 40
//Output:100
//Description:Accept matrix element input from user and return addition
//Date: 03/09/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////



//Diagonal Additon
import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow,iCol);
	}
	int DiagonalAdd()
	{
		int iSum = 0;
		for(int i = 0; i < Arr.length; i++)
		{
			for (int j = 0;j < Arr[i].length ;j++ )
			{
				if((i == 0) || (i == Arr.length-1) || (j == 0) || (j == Arr[i].length-1))
				{
				iSum = iSum + Arr[i][j];
				}	
			}
		}		
		return iSum;
	}
}
class DiagonalAdd
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
		int ret = dobj.DiagonalAdd();
		System.out.println("Addition is : "+ret);
		System.gc();
	}
}
