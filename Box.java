/////////////////////////////////////////////////////
//Function Name:Box
//Input:--
//Output:--
//Description:Volume of Box
//Date: 11/05/2021
//Author: Shubham Lodha
///////////////////////////////////////////////////////

class Box
{
	double width;
	double height;
	double depth;
	
	Box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	void volume()
	{
		double vol=width*height*depth;
		System.out.println("Volume is"+vol);
	}
}

class BoxWeight extends Box0
{
	static double weight;
	BoxWeight(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight=m;
	}
}

	
	public static void main(String[] args)
	{
		BoxWeight bw=new BoxWeight(10,20,30,40);
		bw.volume();
		System.out.println("Weight is"+weight);
	}


















		