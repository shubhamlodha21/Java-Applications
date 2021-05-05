////////////////////////////////////////////////////////
//Function Name:Avarage
//Input:3 (10 20 30)
//Output:20
//Description:Accept Number From User And Display Avarage
//Date: 06/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.util.*;

class Avarage
{
	public static void main(String[] args)
    {
		int sum=0;
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
        
      
        for(int i=0;i<Arr.length;i++)
        {
        	sum=sum+Arr[i];
        }

        int avarage=sum/iNo;


        System.out.println("Avarage is: "+avarage);	

	}
}