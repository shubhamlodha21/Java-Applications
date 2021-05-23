////////////////////////////////////////////////////////
//Function Name:CmdL
//Input:--
//Output:--
//Description:Used of command-line Argument
//Date: 23/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

class CmdL
{
	public static void main(String[] args)
    {
	int count=0,i=0;
	String string;
	count=args.length;
    System.out.println("Arguments Are:"+count);
    while(i<count)
    {
    	string=args[i];
    	i++;
    	System.out.println(i+"    "+"Java is"+string);
    }
}
}