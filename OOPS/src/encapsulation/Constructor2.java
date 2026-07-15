package encapsulation;
class Laptop10{
	private String brand;
	private int ram;
	private String processor;
	
	public Laptop10(String brand,int ram,String processor) {
		this.brand = brand;
		this.ram = ram;
		this.processor = processor;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getRam() {
		return ram;
	}
	
	public String getProcessor() {
		return processor;
	}
}
public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop10 l = new Laptop10("Lenovo",16,"Intel core i7");
		System.out.println(l.getBrand());
		System.out.println(l.getProcessor());
		System.out.println(l.getRam());
		

	}

}
