////////////////////////////////////////////////////////
//Function Name:LB35
//Input:E
//Output:Vowel is Present
//Description:Accept on character from user and check whether that character is vowel (a,e,i,o,u) or not
//Date: 07/08/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


import java.util.*;

class LB35
{
	public static void main(String[] args) 
	{
		char ch='\0';
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Character:");
	    ch = sobj.next().charAt(0);   
        
        if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
        {
		System.out.printf("Vowels Are Present");
	    }
	    else
	    {
	    System.out.printf("Vowels Are Not Present");	
	    }
	}
}