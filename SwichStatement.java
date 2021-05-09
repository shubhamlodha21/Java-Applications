////////////////////////////////////////////////////////
//Function Name:SwitchStatement
//Input:--
//Output:--
//Description: Used of Switch Statement
//Date: 10/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


 import java.util.*;
 class SwichStatement
 {
 	public static void main(String[] args)
 	 { 
 	 	
 	 	Scanner sobj=new Scanner(System.in);

 	 	System.out.println("Enter The Standard in between 7th to 10th");
 	 	int standard=sobj.nextInt();

 	 	switch(standard)
 	 	{
 	 		case 7:
 	 		System.out.println("Exam is at 9 AM");
 	 		break;

 	 		case 8:
 	 		System.out.println("Exam is at 9:30AM");
 	 		break;
 	 		
 	 		case 9:
 	 		System.out.println("Exam is at 10 AM");
 	 		break;
 	 		
 	 		case 10:
 	 		System.out.println("Exam is at 10:30 AM");
 	 		break;
 	 		
 	 		default:
 	 		System.out.println("Yorve Entered Wrong Standard...!");
 	 		break;
 	 		

 	 	}
 		
 	}

 }