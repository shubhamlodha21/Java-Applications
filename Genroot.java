////////////////////////////////////////////////////////
//Function Name:GenRoot
//Input: 923
//Output:927	->	18	->	9
//Description:Find the Generic Root of Number
//Date: 11/06/2021
//Author: Shubham Lodha
//////////////////////////////////////////////////////

import java.util.*;

// 927	->	18	->	9
// 9975	->	30	->	3
// 89457 ->	33	-> 6	
// 8	-> 8
// 23 -> 5

class Digits
{
	int GenRoot(int iNo)	// 927
	{
		int iSum = iNo;	// 927

		while(iSum > 9)		// 18
		{	
			iNo = iSum;		// 927		18
			iSum = 0;
			while(iNo != 0)
			{
				iSum = iSum + (iNo % 10);	//7	9	18	- 8	9
				iNo = iNo / 10;
			}
		}
		return iSum;
	}
}

class Genroot
{
	public static void main(String arg[])
	{
		int no,ret;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		no = sobj.nextInt();
		
		Digits dobj = new Digits();
		ret = dobj.GenRoot(no);
		System.out.println("Generic root is : "+ret);

	}
}