package inheritance;
//Multilevel Inheritance
class Demo1
{
	int a = 100;
	void fun1()
	{
		System.out.println("Java");
	}
}

class Demo2 extends Demo1
{
	int b = 200;
	void fun2()
	{
		System.out.println("Python");
	}
}

class Demo3 extends Demo2
{
	int c = 300;
	
	void fun3()
	{
		System.out.println("Javascript");
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class inheritance3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo3 i3 = new Demo3();
		i3.display();
		i3.fun1();
		i3.fun2();
		i3.fun3();
	}
}
