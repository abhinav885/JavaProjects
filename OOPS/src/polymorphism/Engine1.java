package polymorphism;
class Engine{
	private String engNumber;
	private int horsePower;
	
	public Engine(String engNumber,int horsePower) {
		super();
		this.engNumber = engNumber;
		this.horsePower = horsePower;
	}

	public String getEngNumber() {
		return engNumber;
	}

	public int getHorsePower() {
		return horsePower;
	}
	void displayEngine() {
		System.out.println("EngineNumber: "+engNumber);
		System.out.println("HorsePower: "+horsePower);
	}
}

class Car{
	private String brand;
	private Engine engine;
	public Car(String brand,String engNumber,int horsePower) {
		super();
		this.brand = brand;
		this.engine = new Engine(engNumber,horsePower);
	}
	void displayCar() {
		System.out.println("Brand: "+brand);
		engine.displayEngine();
	}
}
public class Engine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Toyota","ENG101",150);
		c.displayCar();

	}

}
