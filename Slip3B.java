/* Slip 3-B Write a JDBC program to display the details
            of employees (eno, ename, department, sal) 
            whose deapartment is "Computer Science".
*/

import java.sql.*;

public class Slip3B
{z
    public static void main(String args[]) throws Exception
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");

            System.out.println("Connection Done");
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from emp where dept_NAME='Comp Sci'");
            while(rs.next())
            {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String dept = rs.getString(3);
                System.out.println(id+" "+name+" "+dept);
            }
            rs.close();
            con.close();
        }
        catch(ClassNotFoundException s)
        {
            s.printStackTrace();
        }
        catch(SQLException s)
        {
            s.printStackTrace();
        }
    }
}