package encapsulation;
class Student6
{
	String name;
	int age;
	int rollNumber;
	String college;
	
	Student6()
	{
		this("unknown");
		System.out.println("First constructor");
	}
	
	Student6(String name)
	{
		this(name,0);
		System.out.println("Second constructor");
	}
	
	Student6(String name,int age)
	{
		this(name,age,5);
		System.out.println("Third constructor");
	}
	
	Student6(String name,int age,int rollNumber)
	{
		this(name,age,rollNumber,"unknown");
		System.out.println("Fourth constructor");
	}
	
	Student6(String name,int age,int rollNumber,String college)
	{
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.college = college;
		System.out.println("Fifth constructor");
	}
	
	void markAttendance()
	{
		System.out.println("Attendance marked: "+name);
	}
}
public class Student3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student6 s = new Student6();
		Student6 s1 = new Student6("Abhinav");
		Student6 s2 = new Student6("philips",32);
		Student6 s3 = new Student6("Jacob",22,41);
		Student6 s4 = new Student6("david",30,12,"cambridge");
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.rollNumber);
		System.out.println(s1.college);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.rollNumber);
		System.out.println(s2.college);
		
	}

}
