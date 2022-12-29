package anudip;

class UseArea {
	void area(int x,int y)
	{
		System.out.println("The area of rectangle is:"+x*y);
		
	}
	void area(int x)
	{
		System.out.println("The area of square is:"+x*x);
	}

}
class Area
{
	public static void main(String[] args)
	{
		UseArea a=new UseArea();
		a.area(50,20);
		a.area(25);
	}
}
