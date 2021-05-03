////////////////////////////////////////////////////////
//Function Name:Retirement
//Input:int
//Output:String
//Description: Money at year of Retirement
//Date: 03/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.util.*;
class Retirement 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);

	    System.out.println("How Much Money do you need to retire..?");
	    int goal=in.nextInt();


	    System.out.println("How Much Money do you Contribute pr Year..?");
	    int money=in.nextInt();

        System.out.println("Intrest rate in %");
        double intrest=in.nextDouble();

        double balance=0;
        int years=0;

        while(balance<goal)
        {
        	balance=balance+money;
        	double inter=balance+balance*intrest/100;
        	balance=balance + intrest;
        	years++;
        }

        System.out.println("You can retire in:"  + years + "with balance"  +balance);

	}
}