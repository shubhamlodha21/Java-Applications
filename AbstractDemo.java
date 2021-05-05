////////////////////////////////////////////////////////
//Function Name:AbstractDemo
//Input:3
//Output:28.26
//Description:Used of Abstract method.
//Date: 06/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

abstract class Area
{
	public float Radius;
	Area(float no)
	{
	  Radius=no;
	}

public abstract float CalculateArea();

public void Display()
  {
	System.out.println("Radius is:" +Radius);
  }
}

class Calculations extends Area
{
	public Calculations (float Value)
	{
		super(Value);
	}


public float CalculateArea()
{
	return 3.14f*Radius*Radius;
}
}

class AbstractDemo
{
	public static void main(String[] args)
	 {
	   Calculations obj=new Calculations(10.5f);
 
	   float ret=obj.CalculateArea();

	   System.out.println("Area of Circle is:"+ret);
	}
}
	  
