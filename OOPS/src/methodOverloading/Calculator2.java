package methodOverloading;

public class Calculator2 
{
	int multiply(int a,int b)
	{
		return a*b;
	}
	
	double multiply(double a,double b)
	{
		return a*b;
	}
	
	float multiply(float a,float b)
	{
		return a*b;
	}
	
	int multiply(int a,int b,int c)
	{
		return a*b*c;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calculator2 c = new Calculator2();
		int mul = c.multiply(12,10);
		System.out.println("The result is: "+mul);
		double mul1 = c.multiply(2.4,3.2);
		System.out.println("The result is: "+mul1);
		float mul2 = c.multiply(22.3f,31.4f);
		System.out.println("The result is: "+mul2);
		int mul3 = c.multiply(4,5,8);
		System.out.println("The result is: "+mul3);

	}

}
