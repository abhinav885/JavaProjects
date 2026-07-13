package polymorphism;
class Processor{
	private String brand;
	private int cores;
	public Processor(String brand, int cores) {
		super();
		this.brand = brand;
		this.cores = cores;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getCores() {
		return cores;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCores(int cores) {
		this.cores = cores;
	}
	void displayProcessor() {
		System.out.println("Brand: "+getBrand());
		System.out.println("Cores: "+getCores());
	}
}

class Computer{
	private String model;
	Processor p  = new Processor("Intel",8);
	public Computer(String model) {
		super();
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void updateProcessor(String brand,int cores) {
		p.setBrand(brand);
		p.setCores(cores);
	}
	void displayComputer() {
		System.out.println("Model: "+getModel());
		p.displayProcessor();
	}
}
public class Computer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer("Dell Inspiron");
		c.setModel("NVIDIA");
		//c.p.setBrand("RYZEN");//Not a better practice
		//c.p.setCores(4);
		c.updateProcessor("AMD", 0);
		c.displayComputer();

	}

}
