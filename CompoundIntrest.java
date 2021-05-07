///////////////////////////////////////////////////////
//Function Name:CompoundIntrest
//Input:--
//Output:--
//Description:Calculate Compound Intrest.
//Date: 07/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////
import java.lang.*;
import java.util.*;

class CompoundIntrest
{
	public static void main(String[] args)
	{
        final double startrate=10;
        final int nrates=6;
        final int nyears=10;

        double[] interestRate=new double[nrates];
        for(int j=0;j<interestRate.length;j++)
        	interestRate[j]=(startrate+j);

         // System.out.println(interestRate[j]);


        double[][] balances=new double[nyears][nrates];
        for(int j=0;j<balances[0].length;j++)
        	balances[0][j]=10000;

        for(int i=1;i<balances.length;i++)
        {
        	for(int j=0;j<balances[i].length;j++)
        	{
        		double oldBalance=balances[i-1][j];

        		double interest=oldBalance*interestRate[j];

        		balances[i][j]=oldBalance+interest;
        	}
        }

        for(int j=0;j<interestRate.length;j++)
        System.out.printf("%9.0f%%",100*interestRate[j]);
        
        System.out.println();

        for(double [] row: balances)
        {
        	for(double b: row)
        	System.out.printf("%10.2f",b);


            System.out.println();
        }	

	}
}