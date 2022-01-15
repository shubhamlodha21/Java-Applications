/* Slip 4-B write a JDBC program to accept the details of
            customer (CID, CName, Address, Ph_No) and store
            it into the database (Use PrepearedStatement interface).
*/

import java.io.*;
import java.sql.*;
import java.util.*;
public class Slip4B
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");

            PreparedStatement pst = con.prepareStatement("insert into customer values(?,?,?,?)");
            Scanner sc= new Scanner(System.in);
    
            for(int j=1;j<=1;j++)
            {
                System.out.println("Enter cid: ");
                int cid=sc.nextInt();
                
                System.out.println("Enter cname: ");
                String cname=sc.next();
                
                System.out.println("Enter address: ");
                String addr=sc.next();
            
                System.out.println("Enter phno: ");
                Double phno=sc.nextDouble();

                pst.setInt(1,cid);
                pst.setString(2,cname);
                pst.setString(3,addr);
                pst.setDouble(4,phno);
                pst.executeUpdate();
            }
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
    