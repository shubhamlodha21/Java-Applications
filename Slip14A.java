/* Slip 14-B Write a program to demonstrate the join()
             in multithreading.
*/

class NewThread implements Runnable
{
    String name;
    Thread t;
    NewThread(String threadname)
    {
        name = threadname;
        t = new Thread(this,name);
        System.out.println("child thread "+t);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("thread is interrupted");
        }
        System.out.println(name+" exiting");
    }
}
class Slip14A
{
    public static void main(String args[])
    {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");
        NewThread ob3 = new NewThread("three");
       
        System.out.println("thread one is alive "+ob1.t.isAlive());
        System.out.println("thread two is alive "+ob2.t.isAlive());
        System.out.println("thread three is alive "+ob3.t.isAlive());

        try
        {
            System.out.println("waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
            try
            {
                for(int i=0;i<5;i++)
                {
                    System.out.println("main thread "+i);
                    Thread.sleep(1000);
                }
            }
            catch(InterruptedException e)
            {
               System.out.println("thread is interrupted");
            }
        }
        catch(Exception e)
        {

        }
          System.out.println("thread one is alive "+ob1.t.isAlive());
          System.out.println("thread two is alive "+ob2.t.isAlive());
          System.out.println("thread three is alive "+ob3.t.isAlive());

          System.out.println("main thread exiting");
    }
}