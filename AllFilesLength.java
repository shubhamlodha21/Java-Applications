////////////////////////////////////////////////////////
//Function Name:AllFilesLength
//Description:Display All files names in the folder with the size(in bytes)
//Date: 26/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

public class AllFilesLength
{
    public static void main(String[] args) 
    {
        String maindirpath = "C:\\Users\\sai\\Desktop\\Java (College)";       

        File maindir = new File(maindirpath);
           
        if(maindir.exists() && maindir.isDirectory())
        {
           
             File arr[] = maindir.listFiles();
        

        for (File f : arr) 
         {
             
             if(f.isFile()) 
                 System.out.print(f.getName());
                 System.out.println(f.length());
               
         }
     }
   }
} 