package methodOverloading;

public class Calculator 
{
	int add(int a,int b)
	{
		return a+b;
	}
	
	double add(int a,double b)
	{
		return a+b;
	}
	
	float add(float a,float b)
	{
		return a+b;
	}
	
	double add(double a,double b,double c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int intsum = c.add(10,20);
		System.out.println("Sum of two integers:"+intsum);
		float floatsum = c.add(12.2f,34.7f);
		System.out.println("Sum of two floats:"+floatsum);
		double doublesum = c.add(26,63.8);
		System.out.println("Sum of an integer and a double:"+doublesum);
		double doublesum1 = c.add(31.2,48.8,74.7);
		System.out.println("Sum of three doubles:"+doublesum1);
	}

}
