package encapsulation;
class Student5
{
	String name;
	int age;
	int rollNumber;
	String college;
	
	Student5()
	{
		this("unknown");
		System.out.println("Iam in first constructor");
	}
	
	Student5(String name)
	{
		this(name,0);//constructor chaining
		System.out.println("Iam in second constructor");
	}
	
	Student5(String name,int age)
	{
		this(name,age,0);
		System.out.println("Iam in third constructor");
	}
	
	Student5(String name,int age,int rollNumber)
	{
		this(name,age,rollNumber,"unknown");
		System.out.println("Iam in fourth constructor");
	}
	
	Student5(String name,int age,int rollNumber,String college)
	{
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.college = college;
		System.out.println("Iam in fifth constructor");
	}
	
	
}
public class Demo5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student5 s = new Student5();
		//Student5 s1 = new Student5("Abhinav");
		//Student5 s2 = new Student5("Adhil",22);
		//Student5 s3 = new Student5("Adwaidh",24,003);
		//Student5 s4 = new Student5("Saleel",26,044);
		
		System.out.println(s.rollNumber);
		System.out.println(s.name);
		System.out.println(s.college);
		System.out.println(s.age);
		
		

	}

}
