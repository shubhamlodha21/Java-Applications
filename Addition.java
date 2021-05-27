////////////////////////////////////////////////////////
//Function Name:Addition
//Input:10 20
//Output:30 
//Description:Addition of two numbers
//Date: 28/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class Mathematics
{
	int Addition(int x,int y)
	{
		return x+y;
	}
}

class Addition
{
	public static void main(String[] args) {
		
	
	    Scanner sobj=new Scanner(System.in);
		int iNo1=0,iNo2=0;

		System.out.println("Enter First Number");
		iNo1=sobj.nextInt();


		System.out.println("Enter Second Number");
		iNo2=sobj.nextInt();

		Mathematics mobj=new Mathematics();
		int ans=mobj.Addition(iNo1,iNo2);

		System.out.println("Addition is:"+ans);
	}

}