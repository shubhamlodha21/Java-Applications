////////////////////////////////////////////////////////
//Function Name:LB34
//Input:A    z
//Output:a   Z
//Description:Accept one character from user and convert case of that character.
//Date: 07/08/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////


import java.util.*;

class LB34
{
	public static void main(String[] args) 
	{
		char ch='\0';
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter a Character:");
	    ch = sobj.next().charAt(0);   
        
        if((ch>='A')&&(ch<='Z'))
        {
		System.out.printf("%c",ch+32);
	    }
	    else if((ch>='a')&&(ch<='z'))
        {
		System.out.printf("%c",ch-32);
	    }
	}
}