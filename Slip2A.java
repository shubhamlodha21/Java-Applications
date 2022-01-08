/* Slip 2-A Write a multithreading program in java to display
            all the vowels from a given string. 
*/ 

import java.util.*;

public class Slip2A implements Runnable
{
   String s1;
   Thread t;
   Slip2A(String j)
   {
       s1 = j;  
       t = new Thread(this);
       t.start();
   }
   public void run()
   {
      int x = 0;
      char ch;
      x = s1.length();
      for(int i=0;i<x;i++)
      {
         ch = s1.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'||
            ch=='A'||ch=='E'||ch=='I'||ch=='u'||ch=='O')
         {
            System.out.println(ch);
         }
      }
      
   }
   public static void main(String args[])
   {
      Slip2A obj = new Slip2A("Shivajidas");
   }
} 