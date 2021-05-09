///////////////////////////////////////////////////////
//Function Name:SSThreads
//Input:--
//Output:--
//Description: Used of synchronized  Threads
//Date: 10/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


class Marvellous
{
	synchronized public void Display (String str)
	{
		System.out.println(" { "+str);
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception obj)
	{}
	System.out.println(" }");
    }
} 

class Demo extends Thread
{
  String message;
  Marvellous obj;

  public Demo(Marvellous ref,String s)
    {
    	this.obj=ref;
    	this.message=s;
    }

    public void run()
    {
    	obj.Display(message);
    }
}

class SSThreads
{
	public static void main(String[] args) throws Exception
	 {
		Marvellous mobj=new Marvellous();
		Demo obj1=new Demo(mobj,"PPA");
		Demo obj2=new Demo(mobj,"LB");
		Demo obj3=new Demo(mobj,"Python");

		obj1.start();
		obj2.start();
		obj3.start();
	}
}