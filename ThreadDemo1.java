// Description: Threading Implementations
// Date : 02/10/2021
// Author : Shubham Lodha

class NewThread1 extends Thread
{
	NewThread1()
	{
		super("Demo Thread1");
		System.out.println("Child Thread");
		start();
	}

	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread"+i);
				Thread.sleep(500);
			}
		}

		catch(InterruptedException e)
		{
			System.out.println("Child thread interrupted"+e);
		}
		System.out.println("Child Thread Exiting..!");
	}
}


class ThreadDemo1
{
	public static void main(String[] args) 
	{
		NewThread1 obj=new NewThread1();
		obj.run();
	}
}