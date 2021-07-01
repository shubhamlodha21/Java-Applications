///////////////////////////////////////////////////////
//Function Name:ExisitingCopy
//Description:Accept file name from user which is existing and accept one another file name. Create the new file with the second name and copy the contents of the first file into second file
//Date: 01/07/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class ExistingCopy
{
	public static void main(String[] args) throws Exception
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter File Name Which is existing");
		String str1=sc.nextLine();

		System.out.println("Enter File Name in Which Copy the existing data with extension");
		String str2=sc.nextLine();


        FileInputStream in=new FileInputStream(str1);
        FileOutputStream out=new FileOutputStream(str2);

		try
        {
            int n;
            while((n=in.read())!=-1)
            out.write(n);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error reading file named '" + str1 + "'");
        }
        finally
        {
            if(in!=null)
            {
            in.close();
            }
        
             if(out!=null)
            {
            out.close();
             }

        }
        System.out.println("File created and Copied Successfully...!"); 
    }
}
