////////////////////////////////////////////////////////
//Function Name:Demo
//Input:--
//Output:values of Z
//Description:Uses of static characteristics and behaviours.
//Date: 05/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

class Demo
{
	public int x,y;
	public static int z=11;

	  public void fun()
	  {
	  System.out.println("Inside Fun");
	  System.out.println("Value of X is:" +this.x);
	  System.out.println("Value of Z is:"+Demo.z);
	  }

	  public static void gun()
	  {
	  System.out.println("Inside Gun");
	  System.out.println("Value of Z is:" +Demo.z);
	  }
}

class StaticDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Value of Z is:"+Demo.z);
		Demo obj=new Demo();
		obj.fun();
		obj.gun();
	}
}