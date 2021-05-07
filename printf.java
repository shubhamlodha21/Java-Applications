///////////////////////////////////////////////////////
//Function Name:main
//Input:--
//Output:--
//Description:Accept a number display its Hexadecimal Number,Octal Number,Binary Number .
//Date: 07/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class printf
{
	public static void main(String[] args) 
	{
         Scanner in=new Scanner(System.in);
          
         System.out.println("Enter a Number:");
         int iNo=in.nextInt();

         System.out.printf("Decimal  Number is: %d\n",iNo);    
  		 System.out.printf("Hexadecimal Number is: %x\n",iNo);
		 System.out.printf("Octal Number  is: %o\n",iNo);
		 System.out.printf("Binary Number is: %ob",iNo);

	}
}