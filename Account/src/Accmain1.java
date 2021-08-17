////////////////////////////
/*class:Accmain1
*Input:
Enter the accno 
101
Enter the acctype 
saving
Enter the accbal 
2000
*Output:
Accno: 101
Acctype: saving
Accbal: 2000.0   
*Description:Implementation of real time banking model
*Date:17-08-2021
*Author Name:Shubham Lodha
*///////////////////////////////////
public class Accmain1 {
	public static void main(String[] args) {
	Accountmanager ac=new Accountmanager();
	Account a=ac.create();
	ac.display(a);
	}
}
