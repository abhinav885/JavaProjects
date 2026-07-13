package methodOverloading;
public class MaximumNumber 
{
	int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	int max(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
	double max(double a,double b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MaximumNumber m = new MaximumNumber();
		int res = m.max(10,20);
		System.out.println(res);
		
		int res1 = m.max(12,40,80);
		System.out.println(res1);
		
		double res2 = m.max(10.1,5.9);
		System.out.println(res2);
		

	}

}
