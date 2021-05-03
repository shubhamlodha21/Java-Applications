///////////////////////////////////////////////////////
//Function Name:Employee
//Input:---
//Output:SWapping 
//Description: Program to Swapping throgh Value And Object.
//Date: 03/05/2021
//Author: Shubham Lodha
////////////////////////////////////////////////////////


class ParamTest
{
	public static void main(String[] args)
   {
		System.out.println("Testing Triple Value");
		double percent=10;
		System.out.println("Before: percent=" +percent);
		tripleValue(percent);
		System.out.println("After: percent=" +percent);


		System.out.println("Testing Triple Salary");
		Employee harry=new Employee("Harry",50000);
		System.out.println("Before: Salary=" +harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: Salary=" +harry.getSalary());

	    System.out.println("Testing Swapping:");
	    Employee a=new Employee("Rocky",40000);
	    Employee b=new Employee("Bunty",60000);
	    System.out.println("Before: a=" +a.getName());
	    System.out.println("Before: b=" +b.getName());
	    swap(a,b);
	    System.out.println("After: a=" +a.getName());
	    System.out.println("After: b=" +b.getName());
		
	}
      public static void tripleValue(double x)
      {
      	x=3*x;
      	System.out.println("End of Method: x=" +x);
      }

        public static void tripleSalary(Employee x)
      {
        x.raiseSalary(200);
        System.out.println("End of Method: Salary=" +x.getSalary());

      }

      public static void swap(Employee x,Employee y)
      {
      	Employee temp=x;
      	x=y;
      	y=temp;
      	   System.out.println("End of Method: x=" +x.getName());
      	   System.out.println("End of Method: y=" +y.getName());

      }
}

class Employee
{
   
   private String name;
   private double salary;
   

   public Employee(String n,double s)
   {
      name=n;
      salary=s;
   }

   public String getName()
   {
      return name;
   }
   public double getSalary()
   {
      return salary;
   }
   public void raiseSalary(double byPercent)
	{
		
		double raise=salary*byPercent/100;
		salary=salary+raise;
	}
}
     
