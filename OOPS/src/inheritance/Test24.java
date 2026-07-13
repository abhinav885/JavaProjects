package inheritance;
class Charger
{
	private String brand;
	private int voltage;
	
	public Charger(String brand, int voltage) 
	{
		super();
		this.brand = brand;
		this.voltage = voltage;
	}

	public String getBrand() {
		return brand;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
}

class Os
{
	private String name;
	private int size;
	
	public Os(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

class Mobile
{
	Os o = new Os("Android",512);
	
	void hasACharger(Charger c)
	{
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
public class Test24 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		Charger c = new Charger("OnePlus",25);
		
		System.out.println(m.o.getName());
		System.out.println(m.o.getSize());
		
		m.hasACharger(c);
		
		m = null;
		//System.out.println(m.o.getName());
		//System.out.println(m.o.getSize());
		
		//m.hasACharger(c);
		
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}

}
