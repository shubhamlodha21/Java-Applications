////////////////////////////////////////////////////////
//Function Name:Inheritances
//Input:--
//Output:--
//Description: Used of Single And Multileveled Inheritances.
//Date: 10/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

class Base
{
	public int i,j;
	public Base()
	{
		System.out.println("base Costructor");
	}
    public void fun()
    {
    	System.out.println("base Fun");
    }
}

class Derived extends Base
{
	public int x,y;
	public Derived()
	{
		System.out.println("Derived Costructor");
	}
    public void gun()
    {
    	System.out.println("Derived Gun");
    }
}

class Marvellous extends Derived
{
	public Marvellous()
	{
		System.out.println("Marvellous Costructor");
	}
    public void mun()
    {
    	System.out.println("Marvellous Mun");
    }
}

class Inheritances
{
	public static void main(String[] args) 
	{
		Base bobj=new Base();
		Derived dobj=new Derived();
		Marvellous mobj=new Marvellous();

		dobj.fun();
		dobj.gun();
		mobj.mun();
		mobj.fun();
		//bobj.gun();  Error
		bobj.fun();

		//Base bobj2= new Derived(); Error
	}
}
