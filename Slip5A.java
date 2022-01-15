/* Slip 5-A Write a java program for implementation scrollable
            ResultSet. Consider Emp table(eno, ename, sal)

            -moveFirst
            -moveLast
            -movePrevious
            -moveNext
*/

import java.io.*;
import java.lang.*;
import java.sql.*;
import java.util.*;

public class Slip5A
{
    public static void main(String args[])throws SQLException, ClassNotFoundException
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");
        Scanner sr = new Scanner(System.in);
        String sql = "Select * from emp";
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = st.executeQuery(sql);

        while(true)
        {
            System.out.println("----MENU----");
            System.out.println("1.MoveFirst");
            System.out.println("2.MoveLast");
            System.out.println("3.MoveNext");
            System.out.println("4.MovePrevious");
            System.out.println("0.Exit");
            int ch = sr.nextInt();

            if(ch==0)
            {
                con.close();
                break;
            }
            else if(ch==1)
            {
                if(!rs.isFirst())
                {
                    rs.first();
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    double sal = rs.getDouble(4);
                    System.out.println(id+" "+name+" "+sal);
                }
            }
            else if(ch==2)
            {
                if(!rs.isLast())
                {
                    rs.last();
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    double sal = rs.getDouble(4);
                    System.out.println(id+" "+name+" "+sal);
                }
            }
            else if(ch==3)
            {
                if(rs.isLast())
                System.out.println("Already on last record!!!");
                else
                {
                    rs.next();
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    double sal = rs.getDouble(4);
                    System.out.println(id+" "+name+" "+sal);
                }
            }
            else if(ch==4)
            {
                if(rs.isFirst())
                System.out.println("Already on first record!!!");
                else
                {
                    rs.previous();
                    int id = rs.getInt(1);
                    String name = rs.getString(2);
                    double sal = rs.getDouble(4);
                    System.out.println(id+" "+name+" "+sal);
                }
            }
            else
                System.out.println("Invalid Choice!!!");
        }
    }
}