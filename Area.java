////////////////////////////////////////////////////////
//Function Name:area
//Input:5   5 
//Output:235.5
//Description:Find Area
//Date: 25/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;
class Area
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);
	    final float PI=3.14f;
	    int r=0,h=0;

	    System.out.println("Enter a Radius:");
	    r=sobj.nextInt();

	    System.out.println("Enter a Height:");
	    h=sobj.nextInt();

	    float area=(PI*r*r)+2*PI*r*h ;

	    System.out.println("Area is:"+area);
	}
}
