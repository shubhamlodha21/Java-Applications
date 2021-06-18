////////////////////////////////////////////////////////
//Function Name:LB12
//Input:5
/*Output:Marvellous Infosystem..!
         Marvellous Infosystem..!
         Marvellous Infosystem..!
         Marvellous Infosystem..!
         Marvellous Infosystem..!  */

//Description:Accept Number from user and print Marvellous Infosystem..! n  times
//Date: 19/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


//Print Marvellous Infosystem n times
import java.util.*;

class LB12
{
	public static void main(String[] args)
    {
	   int iNo1=0;

	   Scanner sobj=new Scanner(System.in);

	   System.out.println("Enter  Number");
	   iNo1=sobj.nextInt();

	   int Arr[]=new int[iNo1];

       for(int i=0;i<Arr.length;i++)
       {
       	 System.out.println("Marvellous Infosystem..!");
       }
	  
	}
}