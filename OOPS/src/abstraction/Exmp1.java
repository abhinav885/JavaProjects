package abstraction;
abstract class Exmp{
	static int a;//static variables
	static {//static block
		a = 10;
	}
	static void fun() {//static method
		
	}
	int b;//non-static variables or instance variables
	
	{		//non-static block or instance block
		b = 20;
	}
	
	void fun1() {//non-static method or instance method
		
	}
	
	public Exmp() {//constructors
		
	}
	
}
public class Exmp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
