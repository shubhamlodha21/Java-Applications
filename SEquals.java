////////////////////////////////////////////////////////
//Function Name:SEquals
//Input:--
//Output:--
//Description: Check Whether Strings Are Equals or Not
//Date: 10/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

class SEquals
{
	public static void main(String[] args) 
	{
		String str="Jay Ganesh..!";
		String str1="jay Ganesh..!";

		if(str.equalsIgnoreCase(str1))
		{
		System.out.println("Strings Are equals");
	    }
	    else
	    {
	    	System.out.println("Strings Are not equals");	
	    }

	}
}