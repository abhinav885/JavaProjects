package abstraction;
abstract class Vehicle{
	abstract void start();
	abstract void stop();
}

class Car extends Vehicle{
	void start() {
		System.out.println("Car starts with key");
	}
	void stop() {
		System.out.println("Car stops using brakes");
	}
}

class Bike extends Vehicle{
	void start() {
		System.out.println("Bike starts with self-start");
	}
	void stop() {
		System.out.println("Bike stops using disc brakes");
	}
}
public class Vehicle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Bike();
		v.start();
		v.stop();
		System.out.println();
		
		Vehicle v1 = new Car();
		v1.start();
		v1.stop();
		System.out.println();

	}

}
