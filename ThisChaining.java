////////////////////////////////////////////////////////
//Function Name:Demo
//Input:--
//Output:values of X and Y.
//Description:Uses of this keyword  with chaining.
//Date: 05/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


class Demo
{
	public int x,y;

	public Demo()
	{
	System.out.println("Inside Default Constructor");
	}

	public Demo(int a,int b)
	{
    this();
	System.out.println("Inside Parameterized Constructor");
	this.x=a;
	System.out.println("Value of x is:" +a);
	this.y=b;
	System.out.println("Value of y is:" +b);
	}
}


 public  class ThisChaining
 {
 	public static void main(String[] args)
 	 {
 		Demo obj=new Demo();
 		Demo obj2=new Demo(100,200);
 	}
 }
