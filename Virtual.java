/////////////////////////////////////////////////////
//Function Name:Virtual
//Input:--
//Output:--
//Description: RunTime Method Dispatches In Java
//Date: 11/05/2021
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

class Virtual
{
	public static void main(String[] args)
	 {
		Base obj=new Derived();
		obj.fun();
		//obj.gun();
		Derived obj2=new Base();
        
	}
}