/////////////////////////////////////////////////////
//Function Name:ThreadS
//Input:--
//Output:--
//Description:Used of Generic Programming
//Date: 11/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

class Demo
{
	public static void Display(Integer arr[])
	{
		System.out.println("Elements of Array Are:");
		for(int i:arr)
		{
		System.out.println(i);
		}
	}

	public static <T> void DisplayX (T arr[])
	{
		System.out.println("Elements of Array Are:");
		for(T i:arr)
		{
		System.out.println(i);
		}
	}
}

class Generic
{
	public static void main(String[] args)
	 {
	 	Integer a[]={10,20,30,40,50};
	 	Float   b[]={10.3f,15.5f,53.5f,99.4f};
	 	Character c[]={'a','b','c'};

	 	Demo.Display(a);
	    Demo.DisplayX(a);
	    Demo.DisplayX(b);
	    Demo.DisplayX(c);
		
	}
}