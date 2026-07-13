package polymorphism;
class Vehicle{
	void move() {
		System.out.println("Vehicle is moving");
	}
}

class Car3 extends Vehicle{
	void move() {
		System.out.println("Car is moving on four wheels");
	}
}

class Bike extends Vehicle{
	void move() {
		System.out.println("Bike is moving on two wheels");
	}
}

class Bus extends Vehicle{
	void move() {
		System.out.println("Bus is carrying passengers");
	}
}

public class Vehicle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
		v = new Bus();
		v.move();

		v = new Bike();
		v.move();
		
		v = new Car3();
		v.move();
		
	}

}
class A{
	static void show() {
		System.out.println("A");
	}
}

class B extends A{
	static void show() {
		System.out.println("B");
	}
}