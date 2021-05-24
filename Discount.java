////////////////////////////////////////////////////////
//Function Name:Discount
//Input:358
//Output:You Got 10% Discount of Mill Cloths items,You Got 15% Discount of Handloom items
//Description:Gets Different types of discount depends upon amount
//Date: 24/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;

class Discount
{
	public static void main(String[] args) 
	{
	 Scanner sobj=new Scanner(System.in);
	 int iNo=0;

	 System.out.println("Enter a Amount:");
	 iNo=sobj.nextInt();

	 if(iNo<=0)
	 {
	 	System.out.println("Entered Amount Greater than 0");
	 }
	 else if(iNo<=100)
	 {
	 	System.out.println("You Got 5% Discount of Handloom items");	 	
	 }	
	 else if((iNo>=101)&&(iNo<=200))
	 {
	 	System.out.println("You Got 5% Discount of Mill Cloths items");
	 	System.out.println("You Got 7.5% Discount of Handloom items");
	 }
	  else if((iNo>=201)&&(iNo<=300))
	 {
	 	System.out.println("You Got 7.5% Discount of Mill Cloths items");
	 	System.out.println("You Got 10% Discount of Handloom items");
	 }
	 else
	 {
	 	System.out.println("You Got 10% Discount of Mill Cloths items");
	 	System.out.println("You Got 15% Discount of Handloom items");

	 }
	}
}