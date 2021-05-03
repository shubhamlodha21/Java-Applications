////////////////////////////////////////////////////////
//Function Name:main
//Input:Shubham 25 90.5
//Output:Name is Shubham And Age is: 25 with 10th Percentage: 90.5
//Description: Accept String,int and flaot as Input.
//Date: 04/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.lang.*;
import java.util.*;

class InputTest
{
	public static void main(String[] args)
	{
        Scanner in=new Scanner(System.in);

	     System.out.println("What is Your Name:");
	     String name=in.nextLine();

	     System.out.println("What is Your Age:");
	     int no=in.nextInt();

         System.out.println("What is Your 10th Percentages:");
	     float fno=in.nextFloat();
	     

	     System.out.println("Name is "+ name +" And Age is: " + no + "with 10th Percentages:"  +fno) ;

	}
}