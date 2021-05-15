///////////////////////////////////////////////////////
//Function Name:SumFac
//Input:--
//Output:--
//Description:Sum of Factorial of Number.
//Date: 16/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class SumFac
{
	public static void main(String[] args)
	 {
		
	int i=0,iNo=0,iSum=0;

	Scanner sobj=new Scanner(System.in);

	System.out.println("Enter a Number");
	iNo=sobj.nextInt();

	for(i=1;i<=iNo/2;i++)
	 {
        if(iNo%i==0)
        {
        	iSum=iSum+i;
        }
     }

    if(iSum==iNo)
    {
    	System.out.println("Given Number is Krishna Murthy Number\n");
    }
    else
    {
    	System.out.println("Given Number is Not Krishna Murthy Number\n");
    }
	
    }
}