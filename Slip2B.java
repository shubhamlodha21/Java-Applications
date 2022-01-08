/* Slip 2-B Write a JDBC program to delete the records of 
            employees whose names are starting with 'A'
            character.
*/

import java.sql.*;//Compu
public class Slip2B
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");
            System.out.println("Conn done");
            Statement st = con.createStatement();

            int i = st.executeUpdate("delete from emp where emp_name like 'A%'");
            System.out.println("Record Deleted..!");
            ResultSet rs = st.executeQuery("select * from emp");
            while(rs.next())
            {
                System.out.println(" "+rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
                System.out.println(" "+rs.getString(4));
            }
            rs.close();
        con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
} 
