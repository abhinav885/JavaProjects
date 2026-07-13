package encapsulation;
class Rectangle
{
	private int length;
	private int breadth;
	//private int area;
	//without getters and setters
	public Rectangle()
	{
		length = 11;
		breadth = 34;
		//area = length*breadth;
	}
	
	public Rectangle(int side)
	{
		length  = side;
		breadth = side;
		//area = length*breadth;
	}
	
	public Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		//area = length*breadth;
	}
	
	/*void display()
	{
		System.out.println("The area is: "+area);
	}*/
	//using setters
	public int getShape()
	{
		return length*breadth;
	}
}
public class Rectangle1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		System.out.println("The area is: "+r.getShape());
		//r.display();
		
		Rectangle r1 = new Rectangle(22);
		System.out.println("The area is: "+r1.getShape());
		//r1.display();
		
		Rectangle r2 = new Rectangle(22,24);
		System.out.println("The area is: "+r2.getShape());
		//r2.display();
		

	}

}
