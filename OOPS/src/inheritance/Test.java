package inheritance;
class Test3
{
	static int a,b;  //Static variables
	
	static           //static block
	{
		System.out.println("Inside Static Block");
		a = 10;
		b = 20;
	}
	
	static void fun1()   //static method
	{
		System.out.println("Inside Static method");
	}
	
	int x,y; // Instance variables
	
	
	{   //Instance Block
		System.out.println("Inside Instance Block");
	}
	
	void fun2()  //Instance method
	{
		System.out.println();
	}
	
	Test3()  //Constructors
	{
		System.out.println("Inside Constructor");
		x = 30;
		y = 40;
	}
}
public class Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test3.fun1();//Static methods can be called using class
		Test3 t = new Test3();
		t.fun2();
	}
}
