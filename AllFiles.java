////////////////////////////////////////////////////////
//Function Name:AllFiles
//Description:Display All files and folders in given  Path
//Date: 26/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

public class AllFiles
{
	public static void main(String[] args) 
	{
		String maindirpath = "C:\\Users\\sai\\Desktop\\LIbrary";
                  

        File maindir = new File(maindirpath);
        //File arr[];
           
        if(maindir.exists() && maindir.isDirectory())
        {
           
             File arr[] = maindir.listFiles();
        

        for (File f : arr) 
         {
             
             if(f.isFile()) 
                 System.out.println(f.getName());
               
             else if(f.isDirectory()) 
             { 
                 System.out.println("[" + f.getName() + "]");
             }
         }
     }
   }
} 