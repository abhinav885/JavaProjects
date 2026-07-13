package inheritance;
class Appliance{
	private String brand;
	private int power;
	
	public String getBrand() {
		return brand;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setAppliance(String brand,int power) {
		this.brand = brand;
		this.power = power;
	}
	String getDescription() {
		return ("Brand: "+getBrand()+" "+"Power: "+getPower()+" ");
	}
}

class WashingMachine extends Appliance{
	private double capacity;

	public WashingMachine(double capacity,String brand,int power) {
		super.setAppliance(brand,power);
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	 
	String getDescription() {
		return(super.getDescription()+"Capacity: "+getCapacity());
	}
}

class Refrigerator extends Appliance{
	private double volume;

	public Refrigerator(double volume,String brand,int power) {
		super.setAppliance(brand,power);
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	String getDescription() {
		return(super.getDescription()+"Volume: "+getVolume());
	}
	
	
}
public class ApplianceDescriptionGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Refrigerator r = new Refrigerator(350,"Samsung",2000);
		System.out.println(r.getDescription());
		WashingMachine w = new WashingMachine(8,"LG",1500);
		System.out.println(w.getDescription());

	}

}
