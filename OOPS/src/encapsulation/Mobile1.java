package encapsulation;
class Mobile
{
	private String brand;
	private String model;
	private float price;
	
	public Mobile()
	{
		brand = "Samsung";
		model = "10th gen";
		price = 12000000;
	}
	
	public Mobile(String brand)
	{
		this.brand = brand;
	}
	
	public Mobile(String brand,String model)
	{
		this.brand = brand;
		this.model = model;
	}
	
	public Mobile(String brand,String model,float price)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Your brand is: "+brand);
		System.out.println("Your model is: "+model);
		System.out.println("Your price is: "+price);
	}
}
public class Mobile1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		Mobile m1 = new Mobile("Apple");
		Mobile m2 = new Mobile("Redmi","8th gen");
		Mobile m3 = new Mobile("i-phone","15th gen",750000);
		m.display();
		m1.display();
		m2.display();
		m3.display();
	}

}
