////////////////////////////////////////////////////////
//Function Name:createFile
//Description:Accept File Name from user and create that file
//Date: 26/06/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.*;

public class CreateFile 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the desired name of your file: ");
        String fileName = sobj.nextLine();
       // fileName = fileName + ".txt";

        File file = new File(fileName);
        if(file.createNewFile())
         {
           System.out.println("File created.");
         } 
         else 
        {
    System.out.println("File already exists.");
        }   
    }
}