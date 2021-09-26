// Description : Enter a Character from user and return its type
// Date : 26/09/2021
// Author : Shubham Lodha

import java.util.*;

class Check
{
	public void fun(char s)
	{
		if((s>=48) && (s<=57))
		{
			System.out.println("It is a Digit");
		}

		else if(((s>=65)&&(s<=92))||((s>=97)&&(s<=122)))
		{
			System.out.println("It is a Charcter");
		}

		else
		{
			System.out.println("It is a Symbol");
		}
	}
}

class Typeis
{
	public static void main(String[] args) 
	{
		char s;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Single Character");
		s=sc.next().charAt(0);

		Check obj=new Check();

		obj.fun(s);

	}
}