package inheritance;
class Vehicle9
{
	private String brand;
	private String model;
	
	public void setVehicle(String brand,String model)
	{
		this.brand = brand;
		this.model = model;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public String getInfo()
	{
		return ("Vehicle Info: Brand: "+ brand +"Model: "+ model);
	}
}

class car5 extends Vehicle9
{
	private int seats;
	
	public void setVehicle(String brand,String model,int seats)
	{
		super.setVehicle(brand,model);
		this.seats = seats;
	}
	
	public int getSeats()
	{
		return seats;
	}
	
	public String getInfo()
	{
		return("Vehicle Info: Brand: "+ getBrand() +","+" Model: "+getModel() +","+" Seats: "+getSeats());
	}
}

class Bike1 extends Vehicle9
{	
	private String type;
	public void setVehicle(String brand,String model,String type)
	{
		super.setVehicle(brand, model);
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getInfo()
	{
		return("Vehicle Info: Brand "+getBrand()+","+" Model: "+getModel()+","+"Type: "+getType());
	}
}
	public class Vehicle10 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		car5 c = new car5();
		c.setVehicle("Toyotta","Corolla",5);
		System.out.println(c.getInfo());
		Bike1 b = new Bike1();
		b.setVehicle("Yamaha","MT-07","Sport");
		System.out.println(b.getInfo());
		

	}

}
