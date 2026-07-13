package encapsulation;
class shape1
{
	private float length;
	private float breadth;
	
	public shape1()
	{
		this(10);
	}
	
	public shape1(int side)
	{
		this(side,side);
	}
	
	public shape1(float length,float breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	void area()
	{
		System.out.println("Area = "+length*breadth);
	}
	
	void perimeter()
	{
		System.out.println("Perimeter = "+2*(length+breadth));
	}
}
public class Shape 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		shape1 s = new shape1();
		s.area();
		s.perimeter();
		System.out.println();
		
		shape1 s1 = new shape1(12);
		s1.area();
		s1.perimeter();
		System.out.println();
		
		shape1 s2 = new shape1(12,17);
		s2.area();
		s2.perimeter();
		System.out.println();
		

	}

}
