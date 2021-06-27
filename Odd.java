////////////////////////////////////////////////////////
//Function Name:Odd
//Input:10
//Output:1 3 5 7 9
//Description:Program to Display Odd Numbers
//Date:27/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.Scanner;
public class Odd
 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the no ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd numbers are : "+i);
			}
		}

	}

}