////////////////////////////////////////////////////////
//Function Name:EvenDivisible3
//Input:10
//Output: 6
//Description:Program to Display Even Divisible of 3
//Date:27/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.Scanner;
public class EvenDivisible3
 {
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the no ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if((i%2==0)&&(i%3==0))
			{
				System.out.println("Even Divible by 3 numbers are : "+i);
			}
		}

	}

}