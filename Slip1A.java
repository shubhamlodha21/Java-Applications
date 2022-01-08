/* Slip 1-A Write a java program to display IP Address
            and Name of client machine.
*/

import java.net.*;

public class Slip1A
{
    public static void main(String args[])throws UnknownHostException
    {
        InetAddress h = InetAddress.getLocalHost();
        System.out.println("Address: "+h);
        System.out.println("Host Name: "+h.getHostName());
        System.out.println("Host Address: "+h.getHostAddress());
    }
}