 /* Slip 12-A Write a Java program to create Teacher table(TNo,
        Tname, Sal, Des) and insert a record in it.
*/

import java.io.*;
import java.sql.*;

public class Slip12A
{
    static Connection cn;
    static Statement st;
    public static void main(String args[])
    {
        try
        {
            int tno,sal,i;
            String tname,desg;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            cn = DriverManager.getConnection("jdbc:odbc:mydsn");
            st = cn.createStatement();

            /*String str = "create table Teacher(TNo number, TName varchar(20), Sal number, Desg varchar(20))";
            i = st.executeUpdate(str);
            System.out.println("table created "+i);*/

            System.out.println("Enter Tno: ");
            tno = Integer.parseInt(br.readLine());
            System.out.println("Enter TName: ");
            tname = br.readLine();
            System.out.println("Enter Sal: ");
            sal = Integer.parseInt(br.readLine());
            System.out.println("Enter Desg: ");
            desg = br.readLine();
            i  =  st.executeUpdate("insert into Teacher values("+tno+",'"+tname+"',"+sal+",'"+desg+"')");
            System.out.println("Record Added Successfully");
            cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}