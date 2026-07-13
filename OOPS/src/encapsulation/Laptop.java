package encapsulation;
class Laptop1{
	private String company;
	private String processor;
	private int ram;
	private int ssd;
	
	public Laptop1() {
		this("NVIDIA");
	}
	
	public Laptop1(String company) {
		this(company,"M5-pro");
	}
	
	public Laptop1(String company,String processor) {
		this(company,processor,8,256);
	}

	public Laptop1(String company, String processor, int ram, int ssd) {
		super();
		this.company = company;
		this.processor = processor;
		this.ram = ram;
		this.ssd = ssd;
	}
	
	void display()
	{
		System.out.println("Company name is: "+company);
		System.out.println("Processor name is: "+processor);
		System.out.println("Ram is: "+ram);
		System.out.println("ssd is: "+ssd);
	}
	
	
}
public class Laptop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Laptop1 l = new Laptop1();
		l.display();
		System.out.println();
		
		Laptop1 l1 = new Laptop1("Intel");
		l1.display();
		System.out.println();
		
		Laptop1 l2 = new Laptop1("AMD","Ryzen",16,512);
		l2.display();
		

	}

}
