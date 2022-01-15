/* Slip 6-A Write java program which will display name
            and priority of current thread. Change name of Thread
            to MyThread and priority to 2. Display the details of Thread. 
*/

class Slip6A
{
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: "+ t);
        System.out.println(t.getName());
        t.setPriority(2);
        t.setName("MyThread");
        System.out.println("Thread with new name: "+ t);
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
            System.out.println("main thread interrupted");
        }
    }
}