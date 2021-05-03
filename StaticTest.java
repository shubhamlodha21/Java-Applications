///////////////////////////////////////////////////////
//Function Name:Employee
//Input:---
//Output:Employe Details.
//Description: Program to Record Employes Name,Salary,BirthDay And count them with Static Id.
//Date: 03/05/2021
//Author: Shubham Lodha
////////////////////////////////////////////////////////

import java.time.*;
import java.util.*;

public class StaticTest
{
	public static void main(String[] args)
   {
	Employe[] staff=new Employe[3];
  
   staff[0]=new Employe("Shubham",70000);
   staff[1]=new Employe("Shruti",80000);
   staff[2]=new Employe("Siddharth",75000);
   
   for(Employe e: staff)
   {
      e.setId();
   	System.out.println("Name is:"+e.getName() +"Salary is:" +e.getSalary()); 
   }
   		              

    int n=Employe.getNextId();
    System.out.println("Next Avaliable Id =" +n);
 }
}
class Employe
{
   private static int nextId=1;

   private String name;
   private double salary;
   private int id;

   public Employe(String n,double s)
   {
      name=n;
      salary=s;
      id=0;
   }

   public String getName()
   {
      return name;
   }
   public double getSalary()
   {
      return salary;
   }
   public int getId()
   {
      return id;
   }
   public void setId()
   {
      
     id=nextId;
     nextId++;
   }
   public static int getNextId()
   {
      return nextId;
   }
   public static void main(String args[])
   {
      Employe e=new Employe("Shiva",50000);
      System.out.println(e.getName()+"  "+e.getSalary());
   }
}
   