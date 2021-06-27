////////////////////////////////////////////////////////
//Function Name:Even
//Input:10
//Output:2 4 6 8 10
//Description:Program to Display Even Numbers
//Date:27/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.Scanner;
public class Even
 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the no ");
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even numbers are : "+i);
			}
		}

	}

}