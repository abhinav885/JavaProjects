package encapsulation;

import java.util.Scanner;

class Car1
{
	private String make;
	private String model;
	private int year;
	private float price;
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public float getPrice()
	{
		return price;
	}
}
public class Car 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    Car1 c = new Car1();
	    
		c.setMake(sc.nextLine());
		c.setModel(sc.nextLine());
		c.setYear(sc.nextInt());
		sc.nextLine();
		c.setPrice(sc.nextFloat());
		
		System.out.println("The Car name is: "+c.getMake());
		System.out.println("The Model name is: "+c.getModel());
		System.out.println("The Year is: "+c.getYear());
		System.out.println("The Price is: "+c.getPrice());
		
		sc.close();

	}
}
