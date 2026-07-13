package abstraction;
abstract class Shape
{
		float area;
		abstract void acceptInput();
		abstract void calcArea();
		void dispArea()
		{
			System.out.println("Area is: "+area);
		}
}
	class Square extends Shape
	{
		private int side;
		void acceptInput()
		{
			side = 10;
		}
		void calcArea()
		{
			area = side*side;
		}
		
	}
	
	class Rectangle extends Shape
	{
		private int length;
		private int breadth;
		void acceptInput()
		{
			length = 4;
			breadth = 6;
		}
		void calcArea()
		{
			area = length*breadth;
		}
	}
	
	class Circle extends Shape
	{
		private int radius;
		void acceptInput()
		{
			radius = 3;
		}
		
		void calcArea()
		{
			area = 3.14f*radius*radius;
		}
	}
	
	class combine
	{
		void allArea(Shape sh)
		{
			sh.acceptInput();
			sh.calcArea();
			sh.dispArea();
		}
	}
	
	
	public class ShapeArea{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Square sq = new Square();
		Rectangle re = new Rectangle();
		Circle ci = new Circle();
		
		combine co = new combine();
		co.allArea(sq);
		co.allArea(re);
		co.allArea(ci);
	}
}
