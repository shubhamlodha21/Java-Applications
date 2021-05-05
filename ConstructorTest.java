///////////////////////////////////////////////////////
//Function Name:Employee
//Input:---
//Output:Employe Details.
//Description: Programe to Display Employe Details throgh Constructor
//Date: 03/05/2021
//Author: Shubham Lodha
////////////////////////////////////////////////////////
import java.util.*;

public class ConstructorTest
{
	public static void main(String[] args)
   {
	Employee[] staff=new Employee[3];
  
   staff[0]=new Employee("Shubham",70000);
   staff[1]=new Employee(80000);
   staff[2]=new Employee();
   

   for(Employee e: staff)
   	System.out.println("Name is:"+e.getName() +"Salary is:" +e.getSalary());
   }
}

class Employee
{
   private static int nextId;
   private int id;
   private String name="";
   private double salary;

   static
   {
     Random generator=new Random();
     nextId=generator.nextInt(10000);

   }

   {
      id=nextId;
      nextId++;
   }
 
   public Employee(String n,double s)
   {
      name=n;
      salary=s;
   }

   public Employee(double s)
  {
     this("Employee #"+nextId,s);
  }

  public Employee()
  {


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
}