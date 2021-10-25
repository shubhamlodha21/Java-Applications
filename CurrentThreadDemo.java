//Basic for Threading

class CurrentThreadDemo extends Thread
{
	public static void main(String args[]) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread:"+t);
		System.out.println(t.getName());
		t.setPriority(3);
		t.setName("My Thread");
		System.out.println("Thread with new name is:"+t);

		try	
		{
			  for(int i=5;i>0;i--)
			  {
			  	System.out.println(i);
			  	t.sleep(5);
			  }
		}

		catch(Exception e)
		{
			System.out.println("Main Thread Interrupted");
		}
	}
}