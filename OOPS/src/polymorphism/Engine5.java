package polymorphism;
class Engine4{
	private String engNumber;
	private int horsePower;
	
	public Engine4(String engNumber,int horsePower) {
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
}
class Car1{
	private String brand;
	Engine4 e = new Engine4("ENG101",150);
	public Car1(String brand) {
		super();
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}

	void displayCar() {
		System.out.println("Brand: "+brand);
		System.out.println("Engine Number: "+e.getEngNumber());
		System.out.println("Horse Power: "+e.getHorsePower());
	}
}
public class Engine5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car1 c = new Car1("Toyota");
		c.displayCar();
		System.out.println();
		//Accessing engine through car
		//System.out.println(c.getBrand());
		//System.out.println("Engine Number: "+c.e.getEngNumber());
		//System.out.println("Horse Power: "+c.e.getHorsePower());

	}

}
