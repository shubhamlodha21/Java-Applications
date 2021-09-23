//Description:Find final Velocity and Distance travelled
//Date: 23/09/2021
//Author: Shubham Lodha

import java.util.*;

class Calculation
{

	public int vel(int u,int a,int t)
		{
			int v=u+a*t;
			return v;
		}

	public double distance(int u,int a,int t)
		{
			double s=(u*t+0.5*a*t*t);
			return s;
		}
}

class Velocity
{
	public static void main(String[] args) 
	{
		int u=0,a=0,t=0;
		double dRet=0.0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Initial Velocity:");
		u=sc.nextInt();

		System.out.println("Enter Acceleration:");
		a=sc.nextInt();

		System.out.println("Enter Time in Second:");
		t=sc.nextInt();

		Calculation obj=new Calculation();//Creation of object

		dRet=obj.vel(u,a,t);
		System.out.println("Final Velocity is:" +dRet);

		dRet=obj.distance(u,a,t);
		System.out.println("Distances travelled is: "+dRet);
	
	}
}