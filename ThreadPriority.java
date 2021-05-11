/////////////////////////////////////////////////////
//Function Name:ThreadPriority
//Input:--
//Output:--
//Description: Count ThreadPriority of Threads.
//Date: 12/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;
 class Demo extends Thread
{
	public void run()
	{	
    System.out.println("Priority of Thread is:"+Thread.currentThread().getPriority());
    }
}

class ThreadPriority
{
	public static void main(String[] args)
	 {
		System.out.println("Inside Main Thread");
		Thread t=new Thread(new Demo());

		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t.getPriority());

		t.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t.getPriority());

		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());

		t.start();
	}
}
