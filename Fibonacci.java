////////////////////////////////////////////////////////
//Function Name:Fibonacci
//Input:5
//Output:1 1 2 3 5
//Description: Print the Fibonacci Series
//Date: 24/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.util.*;
class Fibonacci
{
	public static void main(String[] args) 
	{
		int a=1,count=0,b=0,c=0,iNo=0;

		Scanner sobj=new Scanner(System.in);

		System.out.print("Enter a number");
		iNo=sobj.nextInt();

		while(count<iNo)
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
			count++;
		}

	}
}