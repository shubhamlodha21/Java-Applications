////////////////////////////////////////////////////////
//Function Name:Demo
//Input:--
//Output:values of X:
//Description:Perform Arithmetic operations
//Date: 05/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

class Arithmetic
{
	public int no1,no2,no3;
	public Arithmetic()
	{
		System.out.println("Inside default constructor");
		{
			no1=0;
			no2=0;
		}
	}

	public Arithmetic(int x,int y)
	{
		System.out.println("Inside parameterized constructor");
		{
			no1=x;
			no2=y;

		}
	}

	public Arithmetic(int x,int y,int z)
	{
		System.out.println("Inside 2nd parameterized constructor");
		{
			no1=x;
			no2=y;
			no3=z;
		}
	}

 
   public int Add()
	{
       return no1+no2+no3;
	}

	public int Subs()
	{
       return no1-no2-no3;
	}


	public int Multi()
	{
       return no1*no2;
	}

	public int Divi()
	{
		return no1/no2;
	} 
}

class ArithmeticOperations
{
	public static void main(String[] args)
    {
	  Arithmetic obj1=new Arithmetic();
	  Arithmetic obj2=new Arithmetic(50,5);
	  Arithmetic obj3=new Arithmetic(50,5,20);

	  int ret=obj2.Multi();
	  System.out.println("MultiPlication is" +ret);

	  ret=obj2.Divi();
	  System.out.println("Division is"  +ret);

	    ret=obj3.Add();
	  System.out.println("Addition is" +ret);

        ret=obj3.Subs();
	  System.out.println("Substraction is"  +ret);

	    ret=obj1.Multi();
	  System.out.println("MultiPlication is"  +ret);
	}
}
