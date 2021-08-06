//////////////////////////////////////////////////////////
//Function Name:LB23
//Input:5  
//Output: Hello
//Description:Accept on number from user if number is less than 10 then print “Hello” otherwise print “Demo”
//Date: 06/08/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


import java.util.*;

class LB23
{ 
public static void main(String[] args) 
  {
	int iNo=0;

	Scanner sobj= new Scanner(System.in);

	System.out.println("Enter Number");
	iNo=sobj.nextInt();

	if(iNo<10)
	{
		System.out.println("Hello");
	}
	else
	{
		System.out.println("Demo");
	}
}
}
