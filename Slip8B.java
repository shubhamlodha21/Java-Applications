/*  Slip 8-B Write a JDBC application using swing for
             the following.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Slip8B extends JFrame implements ActionListener
{
    private JLabel l1,l2;
    private JButton b1,b2,b3;
    private JPanel inputPanel;
    private JTextField t1;
    Connection con = null;
    Statement stmt;

    public Slip8B() throws SQLException,ClassNotFoundException
    {
        setTitle("DDL Queries");
        setSize(500,500);
        setBackground(Color.gray);

        inputPanel = new JPanel(new FlowLayout());
        l1 = new JLabel("Type DDL Query:");
        l2 = new JLabel("");
        t1 = new JTextField(80);

        b2 = new JButton("Create Table");
        b2.addActionListener(this); 

        b3 = new JButton("Alter Table");
        b3.addActionListener(this);

        b1 = new JButton("Drop Table");
        b1.addActionListener(this);

        inputPanel.add(l1);
        inputPanel.add(t1);
        inputPanel.add(b1);
        inputPanel.add(b2);
        inputPanel.add(b3);
        inputPanel.add(l2);
        add(inputPanel);
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:mydsn");
            stmt = con.createStatement();
            //String query = t1.getText();

            if(ae.getSource() == b2)
            {
                System.out.println("Create table clicked");
                String query = "create table doctor(Doctorid int,dname varchar(10),addr varchar(10))";
                //stmt.executeUpdate(query);
                t1.setText(query);
                int r = stmt.executeUpdate(query);
                System.out.println(r);
                if(r==-1)
                l2.setText("Query executed successfully");
            } 
            else if(ae.getSource() == b1)
            {
                System.out.println("Drop table clicked");
                String query = "drop table doctor";
                t1.setText(query);
                int r = stmt.executeUpdate(query);
                System.out.println(r);
                if(r==-1)
                l2.setText("Query executed successfully");
            } 
            else if(ae.getSource() == b3)
            {
                System.out.println("Alter table clicked");
                String query = "alter table doctor add ph_no int";
                t1.setText(query);
                int r = stmt.executeUpdate(query);
                System.out.println(r);
                if(r==-1)
                l2.setText("Query executed successfully");
            } 
            else
                l2.setText("Syntax error in query");
            stmt.close();
            con.close();
            repaint();
        }
        catch(SQLException se)
        {
            l2.setText("Syntax error in query");
            System.out.println(se);
        }
        catch(ClassNotFoundException c)
        {
            System.out.println(c);
        }
    }
    public static void main(String args[]) throws SQLException,ClassNotFoundException
    {
        Slip8B mainFrame = new Slip8B();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}