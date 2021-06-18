////////////////////////////////////////////////////////
//Function Name:LB11
//Input:50  5
//Output:10
//Description:Accept Number from user return their division
//Date: 19/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class LB11
{
	public static void main(String[] args)
    {
	   int iNo1=0;
	   int iNo2=0;

	   Scanner sobj=new Scanner(System.in);

	   System.out.println("Enter First Number");
	   iNo1=sobj.nextInt();

	   System.out.println("Enter Second Number");
	   iNo2=sobj.nextInt();

	   int iRet=iNo1/iNo2;

	   System.out.println("Division is:" +iRet);

	}
}