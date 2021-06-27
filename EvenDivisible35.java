////////////////////////////////////////////////////////
//Function Name:EvenDivisible35
//Input:30
//Output:30
//Description:Program to Display Even Divisible of 3 and 5 
//Date:27/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.Scanner;
public class EvenDivisible35
 {
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the no ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if((i%2==0)&&(i%3==0)&&(i%5==0))
			{
				System.out.println("Even Divible by 3 and 5 numbers are : "+i);
			}
		}

	}

}