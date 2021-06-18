////////////////////////////////////////////////////////
//Function Name:LB14
//Input:15
//Output:Number is Divisible by 5
//Description:Accept Number from user and check it is divisble by 5 or Not
//Date: 19/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class LB14
{
	public static void main(String[] args)
    {
	   int iNo1=0;

	   Scanner sobj=new Scanner(System.in);

	   System.out.println("Enter  Number");
	   iNo1=sobj.nextInt();

	   if(iNo1%5==0)
	   { 
	   	System.out.println("Number is Divisible by 5");
	   }
	   else
	   {
        	System.out.println("Number is Not Divisible by 5");
	   }  	
	}
}