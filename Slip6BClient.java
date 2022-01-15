/* Slip 6-B Write a socket program in java for simple stand
            alone chatting application.
*/

import java.io.*;
import java.net.*;

public class Slip6BClient
{
    private Socket msock;
    DataInputStream mdin;
    DataOutputStream mdout;

    public Slip6BClient(InetAddress addr, int port)
    {
        try
        {
            msock = new Socket(addr,port);
            mdin = new DataInputStream(msock.getInputStream());
            mdout = new DataOutputStream(msock.getOutputStream());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        try
        {
            Slip6BClient cli = new Slip6BClient(InetAddress.getLocalHost(),2000);
            cli.talk();
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
    }
    public void talk()
    {
        String msg = new String("");
        while(true)
        {
            try
            {
                DataInputStream dink = new DataInputStream(System.in);
                msg = new String(dink.readLine());
                mdout.writeUTF(msg);
                System.out.println(mdin.readUTF());
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    } 
}