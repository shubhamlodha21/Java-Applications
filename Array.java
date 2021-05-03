////////////////////////////////////////////////////////
//Function Name:Array
//Input:--
//Output:10 20 30 40 50
//Date: 04/05/2021
//Description: Used of For,foreach and Sort method
//Author: Shubham Lodha
///////////////////////////////////////////////////////

//Anonymous_Array
import java.util.*;
import java.math.*;

class Array
{
	public static void main(String[] args)
	 {
		int[] anonymous={10,20,30,40,50};

		System.out.println("Using for-Loop:");
		for(int i=0;i<anonymous.length;i++)
        {
		System.out.println(anonymous[i]);
	    }
        
        System.out.println("Using for-each Loop:");
	    for(int i:anonymous)
	    {
		System.out.println(i);
	    }

	    System.out.println("Array sort method:");
	    Arrays.sort(anonymous);
	    {
	    	System.out.printf("%s",ArraytoString(anonymous));
	    }
	} 
}
