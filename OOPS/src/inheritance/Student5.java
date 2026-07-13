package inheritance;
class Address
{
	private String city;
	private String state;
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public void setName(String city) {
		this.city = city;
	}

	public void setCity(String state) {
		this.state = state;
	}
	
	void display()
	{
		System.out.println("City: "+city);
		System.out.println("State: "+state);
	}
}

class Student10
{
	private String name;
	private Address address;//Aggregation
	
	public Student10(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	void display()
	{
		System.out.println("Name: "+name);
		address.display();
	}
}
public class Student5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Address a = new Address("Bengaluru","Karnataka");
		Student10 s = new Student10("Abhinav",a);
		s.display();
	}
}
