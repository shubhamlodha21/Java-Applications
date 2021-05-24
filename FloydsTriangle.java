////////////////////////////////////////////////////////
//Function Name:FloydsTriangle
//Input:5
//Output:
   /* 
   1 
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1*/

//Description: Print the FloydsTriangle in 0 1 format
//Date: 24/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class FloydsTriangle
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
              if((i+j)%2==1){
             System.out.print("0");
                             }
            else{
          System.out.print("1");
        }
			System.out.printf("\n");
		}
	}
}