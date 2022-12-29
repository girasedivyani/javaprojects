package anudip;


class Shape {
	public void print()
	{
		System.out.println("This is a shape");
	}

}
class Rectangle extends Shape
{
	public void print()
	{
		System.out.println("This is a Rectangle shape");
		
	}
}
class Circle extends Shape
{
	public void print()
	{
		System.out.println("This is cirle shape");
	}
}
class UseShape
{
	public static void main(String[] args)
	{
		Shape s=new Shape();
		s.print();
		Rectangle r=new Rectangle();
		r.print();
		Circle c=new Circle();
		c.print();
	}
}

