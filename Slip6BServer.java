/* Slip 6-B Write a socket program in java for simple stand
            alone chatting application.
*/

import java.io.*;
import java.net.*;

public class Slip6BServer
{
    private ServerSocket mserversock;
    private Socket msock;
    public Slip6BServer()
    {
        try
        {
            mserversock = new ServerSocket(2000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        Slip6BServer mserv = new Slip6BServer();
        mserv.talk();
    }
    public void talk()
    {
        try
        {
            msock = mserversock.accept();
            System.out.println("Waiting for Request");
            DataInputStream din = new DataInputStream(msock.getInputStream());
            DataOutputStream dos = new DataOutputStream(msock.getOutputStream());
            DataInputStream dink = new DataInputStream(System.in);

            while(true)
            {
                System.out.println(din.readUTF());
                dos.writeUTF(dink.readLine());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}