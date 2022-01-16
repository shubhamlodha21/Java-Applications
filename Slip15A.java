/* Slip 15-A Write a program to establish the connection 
             between Java program to database. 
*/

import java.sql.*;
public class Slip15A
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");
            //Statement st = con.createStatement();
            System.out.println("Connection done");
            /*ResultSet rs = st.executeQuery("Select * from emp");
            while(rs.next())
            {
                System.out.println(""+rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(""+rs.getInt(4));
            }
            rs.close();*/
         con.close();
        }
        catch(Exception e)
        {
            
        }
    }
}