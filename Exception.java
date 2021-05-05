////////////////////////////////////////////////////////
//Function Name:Exception
//Input:--
//Output:--
//Description:Exception Handling
//Date: 06/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.util.*;

class Exception
{
	public static void main(String[] args) 
	{
		 int Arr []={10,20,30,40,50};
		 System.out.println("Array Created Successfully..!");

		 Scanner sobj=new Scanner(System.in);
		 System.out.println("Enter Arrays Index");
		 int index=sobj.nextInt();

		 try
		 {
		 	System.out.println("Inside Try block");
		 	System.out.println("Array Element at Specified index is:"+Arr[index]);
		 	System.out.println("End of Try Block");
		 }

		 catch(ArrayIndexOutOfBoundsException  obj)
		 {
		 	System.out.println("Exception Occur: Inside catch");
		 	System.out.println("Exception is:" +obj);
		 }

		 finally
		 {
		 	System.out.println("Inside Finally Block");
		 }

    System.out.println("End of main");
	}
}