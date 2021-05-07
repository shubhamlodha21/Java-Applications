///////////////////////////////////////////////////////
//Function Name:Thread1
//Input:--
//Output:--
//Description:Implementations of Threads
//Date: 07/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////




 import java.lang.*;
 class Demo  extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
	
    {
    System.out.println("Inside Thread"+Thread.currentThread().getName()+" :"+i);

    try
    {
    	Thread.sleep(1000);
    }

    catch(java.lang.Exception e)
    {
      System.out.println("Exception Catch...!");
    }
  }
}
}

class Thread1
{
	public static void main(String[] args) 
	{
		System.out.println("Inside Main Thread");
		Demo obj1 =new Demo();
		Demo obj2 =new Demo();

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);

		t1.setName("First");
		t2.setName("Second");

		t1.start();
		t2.start();

     
     try
     {
       t1.join();
       t2.join();
     }
     

     catch(java.lang.Exception obj)
     {}
     System.out.println("End Main Thread");     
	}
}
