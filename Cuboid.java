//Description:Find Sufrace_Area and volume of Cuboid
//Date: 23/09/2021
//Author: Shubham Lodha

import java.util.*;

class Calculations
{
	public int ans=0;
	public void Surface_area(int l,int b,int h)
	{
		ans=2*((l*b)+(b*h)+(l*h));
		System.out.println("Surface_Area of Cuboid is: "+ans);
	}

	public void Volume(int l,int b,int h)
	{
		ans=l*b*h;
		System.out.println("Volume of Cuboid is: "+ans);
	}
}

class Cuboid
{
	public static void main(String[] args) 
	{
		int l=0,b=0,h=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter length:");
		l=sc.nextInt();

		System.out.println("Enter Breadth:");
		b=sc.nextInt();

		System.out.println("Enter Height:");
		h=sc.nextInt();

		Calculations obj=new Calculations();

		obj.Surface_area(l,b,h);
		obj.Volume(l,b,h);

	}
}