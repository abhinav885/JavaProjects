package encapsulation;
class Employee
{
	//using setters
	private int id;
	private String name;
	private double salary;
	
	//Default Constructor
	public Employee()
	{
		System.out.println("Default Constructor Called");
	}
	
	//Constructor with one parameter
	public Employee(int id)
	{
		this.id = id;
	}
	
	//Constructor with two parameter
	public Employee(int id,String name)
	{
		this.id   = id;
		this.name = name;
	}
	
	//Constructor with three parameter
	public Employee(int id,String name,double salary)
	{
		this.id      = id;
		this.name    = name;
		this.salary  = salary;
	}
	
	//setters
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("Your id is: "+id);
		System.out.println("Your name is: "+name);
		System.out.println("Your salary is: "+salary);
	}
	
}
public class ConstructorOverloading 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Using Default Constructor+setters
		Employee e = new Employee();
		e.setId(121);
		e.setName("Abhi");
		e.setSalary(12000);
		e.display();
		
		System.out.println();
		
		//Using Constructor with one parameter
		Employee e1 = new Employee(101);
		e1.setName("Rahul");//Remaining values using setters
		e1.setSalary(45000);
		e1.display();
		
		System.out.println();
		
		//Using Constructor with two parameters
		Employee e2 = new Employee(334,"Rakesh");
		e2.setSalary(50000);
		e2.display();
		
		System.out.println();
		
		//Using Constructor with three parameters
		Employee e3 = new Employee(441,"Rajani",75000);
		e3.display();
		
		System.out.println();
		

	}

}
