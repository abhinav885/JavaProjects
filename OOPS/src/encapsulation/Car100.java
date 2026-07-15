package encapsulation;
class Car120{
	private String brand;
	private String model;
	private String fuelType;
	private double mileage;
	private float price;
	
	public Car120() {
		this("Toyota");
	}
	
	public Car120(String brand) {
		this(brand,"Innova");
	}
	
	public Car120(String brand,String model) {
		this(brand,model,"Diesel");
	}
	
	public Car120(String brand,String model,String fuelType) {
		this(brand,model,fuelType,18.5);
	}
	
	public Car120(String brand,String model,String fuelType,double mileage) {
		this(brand,model,fuelType,mileage,50000000);
	}
	
	public Car120(String brand,String model,String fuelType,double mileage,float price) {
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.price = price;
	}
	
	void displayDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("FuelType: "+fuelType);
		System.out.println("Mileage: "+mileage);
		System.out.println("Price: "+price);
	}
}
public class Car100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car120 c = new Car120();
		c.displayDetails();
		System.out.println();
		
		Car120 c1 = new Car120("Fortuner");
		c1.displayDetails();
		System.out.println();
		
		Car120 c2 = new Car120("Honda","City");
		c2.displayDetails();
		System.out.println();
		
		Car120 c3 = new Car120("Hyundai","zen","Petrol");
		c3.displayDetails();
		System.out.println();
		
		Car120 c4 = new Car120("BMW","Z6","Petrol",22.5);
		c4.displayDetails();
		System.out.println();
		
		Car120 c5 = new Car120("Audi","A5","Petrol",20.0,40000000);
		c5.displayDetails();
		System.out.println();
	}

}
