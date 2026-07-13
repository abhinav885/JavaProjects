package inheritance;
class Furniture{
	private String material;
	private double price;
	
	public String getMaterial() {
		return material;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setMaterial(String material,double price) {
		this.material = material;
		this.price = price;
	}
	
	String getInfo() {
		return("Material: "+getMaterial()+" "+"Price: "+getPrice());
	}
}

class Chair extends Furniture{
	private String type;

	public Chair(String material,double price,String type) {
		super.setMaterial(material,price);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	String getInfo() {
		return(super.getInfo()+" "+"Type: "+getType());
	}
}

class Table extends Furniture{
	private String shape;
	
	public Table(String material,double price,String shape) {
		super.setMaterial(material, price);
		this.shape = shape;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	
	String getInfo() {
		return(super.getInfo()+" "+"Shape: "+getShape());
	}
}
public class Furniture1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair c = new Chair("wood",150,"office");
		c.setMaterial("Plywood",1000);
		System.out.println(c.getInfo());
		
		Table t = new Table("Metal",200,"round");
		t.setShape("Rectangle");
		System.out.println(t.getInfo());
		
		
		

	}

}
