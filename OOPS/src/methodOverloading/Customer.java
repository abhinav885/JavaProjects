package methodOverloading;

public class Customer 
{
	char gender;
	int cId;
	long mobile;
	String city;
	
	void setDetail(char g)
	{
		gender = g;
	}
	
	void setDetail(int a)
	{
		cId = a;
	}
	
	void setDetail(long m)
	{
		mobile = m;
	}
	
	void setDetail(String c)
	{
		city = c;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.gender = 'm';
		c.mobile = 8848481900L;
		c.city = "Vadakara";
		c.cId = 123;
		
		System.out.println(c.gender);
		System.out.println(c.mobile);
		System.out.println(c.city);
		System.out.println(c.cId);
		System.out.println();
		
		c.setDetail('f');
		c.setDetail(23418203L);
		c.setDetail(241);
		c.setDetail("Thalassery");
		
		System.out.println(c.gender);
		System.out.println(c.mobile);
		System.out.println(c.city);
		System.out.println(c.cId);

	}

}
