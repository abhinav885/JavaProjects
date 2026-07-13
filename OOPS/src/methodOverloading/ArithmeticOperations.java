package methodOverloading;

public class ArithmeticOperations
{
	/*void disp(int a)
	{
		System.out.println(a);
	}*/
	void disp(float a)
	{
		System.out.println(a);
	}
	void disp(char a)
	{
		System.out.println(a);
	}
	void disp(double a)
	{
		System.out.println(a);
	}
	void disp(boolean a)
	{
		System.out.println(true);
	}
	void disp(int a,float b)
	{
		System.out.println(a+b);
	}
	void disp(float a,int b)
	{
		System.out.println(a-b);
	}
	void disp(double a,double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArithmeticOperations p = new ArithmeticOperations();
		p.disp(10);
		p.disp(12.2,20);		

	}

}
