package encapsulation;
class Rectangle3
{
	//using setters
	private int length;
	private int breadth;
	public void setShape()
	{
		length = 11;
		breadth = 12;
	}

	public void setShape(int side)
	{
		length = side;
		breadth = side;
	}
	
	public void setShape(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	//using getters
	/*public int getShape()
	{
		return length*breadth;
	}*/
	
	void display()
	{
		System.out.println("The area is: "+length*breadth);
	}
}
public class Rectangle2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Rectangle3 r = new Rectangle3();
		r.setShape();
		//System.out.println("The area is: "+r.getShape());
		r.display();
		
		Rectangle3 r1 = new Rectangle3();
		r1.setShape(22);
		//System.out.println("The area is: "+r1.getShape());
		r1.display();
		
		Rectangle3 r2 = new Rectangle3();
		r2.setShape(8,9);
		//System.out.println("The area is: "+r2.getShape());
		r2.display();
	}
}
