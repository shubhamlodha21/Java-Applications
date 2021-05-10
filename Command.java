/////////////////////////////////////////////////////
//Function Name:ThreadS
//Input:--
//Output:--
//Description:used of Command Line Arguments
//Date: 11/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


class Command
{
	public static void main(String[] args)
	{
		int no1=Integer.parseInt(args[0]);
		int no2=Integer.parseInt(args[1]);

		int ret=no1+no2;

		System.out.println("Addition is:"+ret);

	}
}