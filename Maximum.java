////////////////////////////////////////////////////////
//Function Name:Maximum
//Input:5 (10 20 30 40 50)
//Output:50
//Description: Accept Number from User and display maximum Number.
//Date: 06/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class Maximum
{
	public static void main(String[] args)
    {
		int max=0;
		int iNo=0;

		Scanner obj=new Scanner(System.in);

		System.out.printf("Enter Number of Elements");
		iNo=obj.nextInt();
       
        int Arr[]=new int [iNo];

		System.out.println("Enter the Elements");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=obj.nextInt();
		}
        
        Arr[0]=max;
        for(int i=0;i<Arr.length;i++)
        {
        	if (Arr[i]>max)
        	{
        		max=Arr[i];
        	}
        }

        System.out.println("Maximum Number is: "+max);	

	}
}