/* Slip 3-A Write a java program to display "Hello java" 
            message n times on the screen. (Use Runnable Interface). 
*/

import java.io.*;
class JavaThread implements Runnable
{
    Thread t1;
    JavaThread()
    {
        t1 = new Thread(this);
        t1.start();
    }
    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Hello Java");
                Thread.sleep(500);  
            }
        }
        catch(InterruptedException e)
        {

        }
    }
}

class Slip3A
{
    public static void main(String args[])throws IOException
    {
        JavaThread jt = new JavaThread();
    }
}

