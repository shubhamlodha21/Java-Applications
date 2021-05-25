////////////////////////////////////////////////////////
//Function Name:TemperatureC
//Input:100
//Output:37
//Description:Converted temperature Ferhinate to Degree Celcius
//Date: 25/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.util.*;

class TemperatureC
{
	public static void main(String[] args)
    {
		Scanner sobj=new Scanner(System.in);
		float tempF=0.0f,tempC=0.0f;

		System.out.println("Enter a Temperature in Ferhinate:");
		tempF=sobj.nextFloat();

		tempC=(float)((tempF-32.0)/1.8);

		System.out.println("Temperature in Celcius is"+tempC+"degree");

	}
}