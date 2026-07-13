package polymorphism;
class Vehicle6{
	void start() {
		System.out.println("Vehicle is able to start");
	}
}

class Car10 extends Vehicle6{
	void start() {
		System.out.println("Car is Starting");
	}
	
	void music() {
		System.out.println("Music can be played inside the car");
	}
}

class Bike3 extends Vehicle6{
	void start() {
		System.out.println("Bike is able to start");
	}
	
	void wheel() {
		System.out.println("Bike has two wheels");
	}
}

class Bus5 extends Vehicle6{
	void start() {
		System.out.println("Bus is able to start");
	}
	
	void openDoor() {
		System.out.println("Bus has an open Door");
	}
}
public class VehicleServiceCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle6 ref;
		ref = new Car10();//Upcasting
		ref.start();
		Car10 c = (Car10)ref;//Downcasting
		c.music();
		
		ref = new Bike3();
		ref.start();
		Bike3 b = (Bike3)ref;
		b.wheel();
		
		ref = new Bus5();
		ref.start();
		Bus5 b1 = (Bus5)ref;
		b1.openDoor();
		

	}

}
