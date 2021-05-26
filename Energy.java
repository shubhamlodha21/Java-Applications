////////////////////////////////////////////////////////
//Function Name:Energy
//Input:--
//Output:--
//Description:Calculate the Energy
//Date: 26/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.util.*;

class Energy
{
	public static void main(String[] args)
    {
		Scanner sobj=new Scanner(System.in);
		float acc,h,ve,m;

		System.out.println("Enter Value of Acceleration:");
		acc=sobj.nextFloat();

		System.out.println("Enter value of Mass in kg:");
		m=sobj.nextFloat();

		System.out.println("Enter Velocity:");
		ve=sobj.nextFloat();

		System.out.println("Enter a Height");
		h=sobj.nextFloat();

		float energy=m*((acc*h)+ve*ve/2);

		System.out.println("Energy is:"+energy);

	}
}