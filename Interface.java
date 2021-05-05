////////////////////////////////////////////////////////
//Function Name:Interface
//Input:3
//Output:28.26 ,18.84
//Description:Used of Interface
//Date: 06/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

interface figures
{
	 public float PI=3.14f;
	 public float Area(float radius);
     public float Circumference(float radius);
}

class Circle implements figures
{
	public float Area(float radius)
	{
		return (PI*radius*radius);
	}
	public float Circumference(float radius)
	{
		return (2*PI*radius);
	}
}

class Interface
{
	public static void main(String[] args)
    {
         Circle obj=new Circle();
         System.out.println("Area is" +obj.Area(10.5f));
         System.out.println("Circumference is"+obj.Circumference(10.5f));
	}
    
}