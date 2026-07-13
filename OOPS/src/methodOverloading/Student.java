package methodOverloading;

public class Student 
{
	//Constructor Overloading
	String name;
	int age;
	boolean found;
	Student()
	{
		name = "unknown";
		age = 0;
		
	}
	Student(int a)
	{
		age = 20;
	}
	Student(String n,int a)
	{
		name = n;
		age = a;
	}
	void disp()
	{
		System.out.println("Name is: "+ name +", Age is: "+ age);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student("Yadhu",20);
		Student s3 = new Student(30);
		s1.disp();
		s2.disp();
		s3.disp();
	}
}
