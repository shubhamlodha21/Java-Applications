///////////////////////////////////////////////////////
//Function Name:Employee
//Input:---
//Output:10 11 20 50 111
//Description: Sorting Elements of Arrays.
//Date: 03/05/2021
//Author: Shubham Lodha
////////////////////////////////////////////////////////
import java.util.*;
class Sorting
{
	public static void main(String[] args)
	{
		int[] Arr={20,10,50,11,111};
        Arrays.sort(Arr);
       System.out.printf("Modified arr[] : %s",
                          Arrays.toString(Arr));
    }
}
