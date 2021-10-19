//Connection between JDBC and mysql

import java.sql.*;
public class Conncheck
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");
            Statement st = con.createStatement();
            System.out.println("Connection done");
            ResultSet rs = st.executeQuery("Select * from emp");
            while(rs.next())
            {
                System.out.println(""+rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            } 
            rs.close(); 
        con.close();
        }
        catch(Exception e)
        {
            
        }
    }
}