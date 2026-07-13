package methodOverloading;

public class Subtraction 
{
	int subtract(int a,int b)
	{
		return a-b;
	}
	
	double subtract(double a,double b)
	{
		return a-b;
	}
	
	double subtract(int a,double b)
	{
		return a-b;
	}
	
	float subtract(float a,float b)
	{
		return a-b;
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Subtraction s = new Subtraction();
		int sub = s.subtract(12,10);
		System.out.println("The result is: "+sub);
		double doublesub = s.subtract(24.3,12.8);
		System.out.println("The result is: "+doublesub);
		double doublesub1 = s.subtract(38,13.4);
		System.out.println("The result is: "+doublesub1);
		float floatsub = s.subtract(43.4f,31.3f);
		System.out.println("The result is: "+floatsub);
		

	}

}
