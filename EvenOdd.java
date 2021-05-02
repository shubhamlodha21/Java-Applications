////////////////////////////////////////////////////////
//Function Name:EvenOdd
//Input:21
//Output: 21 Number is Odd.
//Description:Program to Find Given Number is Even or Odd Without using % Opertor
//Date: 02/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////



class EvenOdd
{
	public static void main(String[] args) 
	{
		int Mask= 0x00000001;
		int i=21;
		
		int result=i&Mask;

		if(result==Mask)
		{
			System.out.println("Number "+ i +" is Odd");
		}
		else
		{
			System.out.println("Number "+ i +" is Even");
		}
	}
}
