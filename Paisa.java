////////////////////////////////////////////////////////
//Function Name:paise
//Input:10.65
//Output:1065
//Description:Converted Rupess into paisa
//Date: 25/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.util.*;
class Paisa
{
	public static void main(String[] args)
    {
    	Scanner sobj=new Scanner(System.in);
        float iNo=0.0f;


    	System.out.println("Enter price in rupees");
    	iNo=sobj.nextFloat();

    	System.out.println("Entered Price is:"+(iNo*100)+"Paisa");
		
	}
}