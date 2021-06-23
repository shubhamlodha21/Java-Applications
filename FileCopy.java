////////////////////////////////////////////////////////
//Function Name:FileCopy
//Input:--
//Output:--
//Description:Copy contents of one file into another by changing alphabets and replace by '*'
//Date: 23/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////



//write a java program to copy the contents of one
//file into the another file,while copying change the
//case of alphabets and replace all the digits by '*'
//in target file.

import java.io.*;
import java.lang.*;

class FileCopy
{
	public static void main(String[] args) throws Exception
	{
	
	try{
        
		FileInputStream fin=new FileInputStream("FileCopy.java");
		FileOutputStream fout=new FileOutputStream("M.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			if(Character.isUpperCase((char)i))
			{i=Character.toLowerCase((char)i);}
			else if(Character.isLowerCase((char)i))
			{i=Character.toUpperCase((char)i);}
			else if(Character.isDigit((char)i))
			{
				i='*';
			}


			fout.write(i);
		}
		System.out.println("Succesfull");
		fin.close();
	   }
	   catch(FileNotFoundException e)
	   {
	   	System.out.println("In exception"+e);
	   }
		
	}
}