//////////////////////////////////////////////////////////
//Function Name:LB24
//Input:12   5  
//Output:12 12 12 12 12
//Description:Accept two numbers from user and display first number in second number of times
//Date: 06/08/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class LB24
{ 
public static void main(String[] args) 
  {
	int iNo=0;
	int iTimes=0;

	Scanner sobj= new Scanner(System.in);

	System.out.println("Enter Number");
	iNo=sobj.nextInt();
 
    System.out.println("Enter Number of times Prints");
	iTimes=sobj.nextInt();

    System.out.println("____________________________________________________________");
	for(int i=0;i<iTimes;i++)
	{
	   System.out.println(" "+iNo);	
	}
  }
}

