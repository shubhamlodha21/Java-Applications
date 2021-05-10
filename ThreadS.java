//////////////////////////////////////////////////////
//Function Name:ThreadS
//Input:--
//Output:--
//Description:MultiThreading in java
//Date: 11/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

class Demo extends Thread
{
	public void run()
	{
		System.out.println("Thread Scheduled");
		for(int i=0;i<=100;i++)
		{
		  System.out.println("Value is:" +i);
		}
	}
}

class ThreadS
{
	public static void main(String[] args) throws Exception
	 {
        System.out.println("Inside Main Method");
        {
        	Thread t1=new Thread(new Demo());
        	Thread t2=new Thread(new Demo());

        	t1.start();
        	t1.join();
        	t2.start();
        	t2.join();

        System.out.println("End Of Main Thread");	
        }   		
	}
}