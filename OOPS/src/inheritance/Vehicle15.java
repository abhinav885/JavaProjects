package inheritance;
class Vehicle12{
	private String brand;
	private String model;
	
	public void setVehicle12(String brand,String model)
	{
		this.brand = brand;
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getInfo() {
		return("Vehicle Info: "+" Brand: "+getBrand()+","+" Model: "+getModel());
	}
}

class car10 extends Vehicle12{
	private int seats;

	public car10(String brand,String model,int seats) {
		setVehicle12(brand,model,seats);
	}
	
	public void setVehicle12(String brand,String model,int seats) {
		super.setVehicle12(brand, model);
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}
	
	public String getInfo()
	{
		return(super.getInfo()+" Seats: "+getSeats());
	}
}
public class Vehicle15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car10 c = new car10("Toyotta","Corolla",5);
		System.out.println(c.getInfo());

	}

}
