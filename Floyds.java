////////////////////////////////////////////////////////
//Function Name:Floyds
//Input:--
//Output:--
//Description:Prints the Floyds Triangle
//Date: 25/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.util.*;

class Floyds
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Rows:");
		int iNo=sobj.nextInt();
		int number=1;
        
		for(int i=1;i<=iNo;i++)
		{
			for(int j=1;j<=i;j++)
            {
				System.out.print(number+"  ");
				number++;
            }
			System.out.printf("\n");
		}
	}
}