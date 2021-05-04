////////////////////////////////////////////////////////
//Function Name:Demo
//Input:--
//Output:Additions 
//Description:Function Overloading
//Date: 05/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.lang.*;

 class Demo
	{
	   public int Add(int a,int b)
		{
			return a+b;
		}

		public int Add(int a,float b)
	   {
            return (int)(a+b);
	   }

	   public float Add(float a,float b,float c)
	   {
	   	   return a+c+b;
	   }
	}


class Overloading
{
   public static void main(String[] args) 
   {
   	   Demo obj=new Demo();
   	   System.out.println(obj.Add(11,21));
   	   System.out.println(obj.Add(11,21.8f));
   	   System.out.println(obj.Add(15.6f,1.9f,6.8f));
    }
}