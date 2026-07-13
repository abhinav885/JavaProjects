package abstraction;

import java.util.Scanner;
abstract class Shape1{
	float area;
	abstract void acceptInput();
	abstract void calcArea();
	void dispArea() {
		System.out.println("Area = "+area);
	}
}
class Square1 extends Shape1{
	private float side;//encapsulation
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square: ");
		side = sc.nextFloat();
	}
	
	void calcArea() {
		area = side*side;
	}
	
}

class Rectangle1 extends Shape1{
	private float length;
	private float breadth;
	
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		length = sc.nextFloat();
		System.out.println("Enter the breadth of rectangle: ");
		breadth = sc.nextFloat();
	}
	
	void calcArea() {
		area = length*breadth;
	}
}

class Circle1 extends Shape1{
	private float radius;	
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		radius = sc.nextFloat();
	}
	
	void calcArea() {
		area = 3.14f*radius*radius;
	}
}

class Geometry {
	/*static void permit(Shape1 ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}*/
	 void permit(Shape1 ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}
public class ShapePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square1 s = new Square1();
		Rectangle1 r = new Rectangle1();
		Circle1 c = new Circle1();
		Geometry g = new Geometry();
		g.permit(s);
		g.permit(r);
		g.permit(c);
		//Geometry.permit(s);
		//Geometry.permit(r);
		//Geometry.permit(c);
	}

}
