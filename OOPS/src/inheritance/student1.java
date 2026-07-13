package inheritance;
class student2
{
	String name;
	int age;
	int rollNo;
	static String college;
	static char grade;
	static final double PI;
	//constructor
	student2(String name,int age,int rollNo)
	{
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
	//static block
	static
	{
		college = "IIT Bangalore";
		grade = 'A';
		PI = 3.14;
	}
}
public class student1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		student2 s = new student2("Abhishek",15,002);
		student2 s1 = new student2("Aditya",21,9);
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.rollNo);
		
		student2.college = "IIT KHARAGPUR";
		System.out.println(student2.college);
		
		student2.college = "IIT GUWAHATI";
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.rollNo);
		System.out.println(student2.college);
		System.out.println(student2.grade);
		System.out.println(student2.PI);
		
		
		

	}

}
