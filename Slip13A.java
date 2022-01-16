/* Slip 13-A Write a java program which will generate
             the threads.

             -To display 10 terms of Fibonacci Series.
             -To display 1 to 10 in reverse order.
*/

import java.io.*;
class Fibonacci extends Thread
{
    public void run()
    {
        try
        {
            int a = 0, b = 1, c = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the limit for fibonacci: ");
            
            int n = Integer.parseInt(br.readLine());
            System.out.println("\n=================");
            System.out.println("Fibonacci Series");
            while(n>0)
            {
                System.out.print(c+" ");
                a = b;
                b = c;
                c = a+b;
                n = n-1;
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
class Reverse extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("\n==================");
            System.out.println("\nReverse is: ");
            System.out.println("====================");
            for(int i=10;i>=1;i--)
            {
                System.out.print(i+" ");
            }
            System.out.println("\n==================\n\n");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
class Slip13A
{
    public static void main(String args[])
    {
        try
        {
            Fibonacci fib = new Fibonacci();
            fib.start();
            fib.sleep(4000);
            Reverse rev = new Reverse();
            rev.start();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}