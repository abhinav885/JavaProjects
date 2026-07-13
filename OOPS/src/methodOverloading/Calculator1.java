package methodOverloading;

public class Calculator1 
{
	float add(float a,float b)
	{
		System.out.println("1");
		return a+b;
	}
	
	double add(float a,double b)
	{
		System.out.println("2");
		return a+b;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calculator1 c = new Calculator1();
		System.out.println(c.add(10,20));
	}

}
