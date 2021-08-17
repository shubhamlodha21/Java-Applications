////////////////////////////
/*class:hotelapp
*Input:
 ----------------------------HOTEL APP---------------------------
	    VEGMENU 	 PRICE 
1		pannerchilly		100
2		noodles,		200
3		soyabean		300
please enter the order no 
1
Do you want to continue order 
1
1		pannerchilly		100
2		noodles,		200
3		soyabean		300
please enter the order no 
2
Do you want to continue order 
1
1		pannerchilly		100
2		noodles,		200
3		soyabean		300
please enter the order no 
1
Do you want to continue order 
2
*Output:
------------------------------------BILL---------------------------------------
1	pannerchilly	100
2	noodles,	200
3	pannerchilly	100
GST: 20.0
FINAL TOTAL: 420.0   
*Description:Implementation of Real time Hotel Application
*Date:17-08-2021
*Author Name:Shubham Lodha
*///////////////////////////////////
package hotelapp;
import java.util.Scanner;
public class hotelapp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String vegmenu[]= {"pannerchilly","noodles,","soyabean"};
		int vegprice[]= {100,200,300};
		int order[]=new int[10];
		int k=0,no=0;
		System.out.println("----------------------------HOTEL APP---------------------------");
		System.out.println("\t VEGMENU \t PRICE ");
		do
		{
			for(int i=0;i<vegmenu.length;i++)
			{
				System.out.println((i+1)+"\t\t"+vegmenu[i]+"\t\t"+vegprice[i]);	
			}
			System.out.println("please enter the order no ");
			no=sc.nextInt();
			order[k]=no;
			k++;
			System.out.println("Do you want to continue order ");
         }while(sc.nextInt()==1);
		float gst,finaltotal=0;
		int total=0;
		for(int i=0;i<k;i++)
		{
			total=total+vegprice[order[i]-1];
		}
		gst=0.05f*total;
		finaltotal=gst+total;
		System.out.println("------------------------------------BILL---------------------------------------");
		for(int i=0;i<k;i++)
		{
			System.out.println((i+1)+"\t"+vegmenu[order[i]-1]+"\t"+vegprice[order[i]-1]);
		}
		System.out.println("GST: "+gst);
		System.out.println("FINAL TOTAL: "+finaltotal);
	}

}
