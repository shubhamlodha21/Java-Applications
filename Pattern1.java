////////////////////////////////////////////////////////
//Function Name:pattern1
//Input:5
//Output:
       /*  1
           22
           333
           4444
           55555
              */ 
//Description: Print the pattern
//Date: 24/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.util.*;
class Pattern1
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);

		int iNo=0;

		System.out.print("Enter a Rows");
		iNo=sobj.nextInt();

      for(int i=1;i<=iNo;i++)
      {
      	for(int j=1;j<=i;j++)
      	{
      		System.out.print(i);
      	}
      	System.out.print("\n");
      }

	}
}