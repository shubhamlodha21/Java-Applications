////////////////////////////////////////////////////////
//Function Name:Round
//Input:9.997
//Output:10
//Description:To Display Round ofvalue of given Number. 
//Date: 02/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

class Round
{
	public static void main(String[] args) 
	{
		double x=9.997;
		int nx=(int)x;//Typecasting
		//System.out.println(nx);
		int nr=(int)Math.round(x);
		System.out.println(nr);
	}
}