package encapsulation;
class Student
{
	//without getters and setters
	private int id;
	private String name;
	private double marks;
	
	public Student()
	{
		this(121,"jadeja");
	}
	
	public Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public Student(int id,String name,double marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void display()
	{
		System.out.println("Your id is: "+id);
		System.out.println("Your name is: "+name);
		System.out.println("Your marks is: "+marks);
		System.out.println();
	}
	
}
public class Student1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println();
		Student s1 = new Student(101,"Abhinav");
		System.out.println();
		Student s2 = new Student(105,"Ms Dhoni",95);
		s.display();
		s1.display();
		s2.display();
	}
}
