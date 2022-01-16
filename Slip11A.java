/* Slip 11-A Write a multithreading program using Runnable
             interface to blink text on the frame. 
*/

import java.awt.*;
import java.awt.event.*;
public class Slip11A extends Frame implements Runnable
{
    Thread t;
    Label l1;
    int f;
    public Slip11A()
    {
        t = new Thread(this);
        t.start();
        setLayout(null);
        l1 = new Label("Hello JAVA");
        l1.setBounds(100,100,100,40);
        add(l1);
        setSize(300,300);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        f=0;
    }
    public void run()
    {
        try
        {
            if(f==0)
            {
                t.sleep(200);
                l1.setText("");
                f=1;
            }
            if(f==1)
            {
                t.sleep(200);
                l1.setText("Hello JAVA");
                f=0;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        run();
    }
    public static void main(String args[])
    {
        new Slip11A();       
    }
}
