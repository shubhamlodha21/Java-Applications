/* Slip 14-B Write a program to exceute a batch of
             SQL statements in Java.
*/

import java.sql.*;
import java.net.*;

class Slip14B
{
    static Connection cn;
    static Statement stmt;
    public static void main(String args[])
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            cn = DriverManager.getConnection("jdbc:odbc:mydsn");
            stmt = cn.createStatement();
            
            //stmt.addBatch("create table test(roll_no number,name text(10))");
            //stmt.addBatch("insert into emp values(12,'Renu','Mktg',30000)");
            stmt.addBatch("update emp set ename = 'Ramesh' where eno = 6");
            //stmt.addBatch("insert into emp values(3,'Anuja','Mktg',30000)");
            //stmt.addBatch("insert into emp values(5,'Tanvi','HR',30000)");
            //stmt.addBatch("insert into emp values(6,'Suresh','HR',40000)");
            

            System.out.println("Table updated");

            int [] result = stmt.executeBatch();

            for(int i=0;i<result.length;i++)
            {
                System.out.println(result[i]);
            }
            stmt.close();
            cn.close();
        }
        catch(BatchUpdateException e)
        {
            int [] count = e.getUpdateCounts();
            for(int i=0;i<count.length;i++)
            {
                System.out.println(count[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println("err");
        }
    }
}