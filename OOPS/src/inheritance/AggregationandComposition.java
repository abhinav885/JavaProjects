package inheritance;

class Bike {
	private String brand;
	private int mileage;

	public Bike(String brand, int mileage) {
		super();
		this.brand = brand;
		this.mileage = mileage;
	}

	public String getBrand() {
		return brand;
	}

	public int getMileage() {
		return mileage;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}

class Book {
	private String name;
	private String author;

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

class Heart {
	private float weight;
	private int bpm;

	public Heart(float weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}

	public float getWeight() {
		return weight;
	}

	public int getBpm() {
		return bpm;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
}

class Brain 
{
	private float weight;
	private String color;
	
	public Brain(float weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public String getColor() {
		return color;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class Student
{
	//Composition is used within objects
	Heart h = new Heart(289,72);
	Brain b2 = new Brain(155,"Yellow");
	
	//Aggregation is taken care using methods
	void hasABike(Bike b)
	{
		System.out.println(b.getBrand());
		System.out.println(b.getMileage());
	}
	
	void hasABook(Book b1)
	{
		System.out.println(b1.getName());
		System.out.println(b1.getAuthor());
	}
}

public class AggregationandComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Bike b = new Bike("Duke",35);
		Book b1 = new Book("Java","JG");
		
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println();
		
		System.out.println(s.b2.getWeight());
		System.out.println(s.b2.getColor());
		System.out.println();
		
		s.hasABike(b);
		s.hasABook(b1);
		
		System.out.println();
		
		//s = null;
		//System.out.println(s.h.getWeight());//Null pointer exception as s cannot be able to access h reference variables
		System.out.println(b.getBrand());
		System.out.println(b.getMileage());
	}

}
