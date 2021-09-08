////////////////////////////////////////////////////////
//Function Name:CurrentThreadDemo
//Input:--

/*Output:
Current Thread is:Thread[main,5,main]
Name is:main
Thread new Name is:Thread[my thread,6,main]
5
4
3
2
1*/

//Description:Implementation of Threading
//Author: Shubham Lodha
//////////////////////////////////////////////////////


import java.lang.*;

class CurrentThreadDemo
{
	public static void main(String[] args) 
	{
		Thread t=Thread.currentThread();
		System.out.println("Current Thread is:"+t);
		System.out.println("Name is:"+t.getName());
		t.setPriority(6);
		t.setName("my thread");
		System.out.println("Thread new Name is:"+t);

		try	
		{
			for(int n=5;n>0;n--)
			{
				System.out.println(n);
				t.sleep(1000);
			}
		}

		catch(InterruptedException e)
		{
			System.out.println("Main thread Interrupted");
		}
	}
}