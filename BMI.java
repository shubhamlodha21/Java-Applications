////////////////////////////////////////////////////////
//Function Name:BMI
//Description:Calculate BMI
//Input: 1.7 75 

//Output:BMI is25.951555
//OverWeight

//Date:22/07/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////



import java.util.*;

class BMI
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter Height in Meters");
		float h=sobj.nextFloat();

		System.out.println("Enter Weight in Kilograms");
		float w=sobj.nextFloat();

		float b=w/(h*h);

		System.out.println("BMI is"+b+"\n");

		if(b<=18.5)
		{
			System.out.println("You are UnderWeight");
		}
		else if((b>18.5)&&(b<=24.9))
		{
			System.out.println("You are Normal");
		}
		else if((b>25)&&(b<=29.9))
		{
			System.out.println("OverWeight");
		}
		else
		{
			System.out.println("Obesity..!");
		}
	}
}