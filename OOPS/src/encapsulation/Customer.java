package encapsulation;

class Customer 
{
	char gender;
	String city;
	int cID;
	long mobile;
	
	void setDetail(char g)
	{
		gender  = g;
	}
	
	void setDetail(String c) 
	{
		city = c;
	}
	
	void setDetail(int i)
	{
		cID = i;
	}
	
	void setDetail(long m)
	{
		mobile = m;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.gender = 'M';
		c1.city = "Bangalore";
		c1.cID = 1234;
		c1.mobile = 987654321;
		
		System.out.println(c1.gender);
		System.out.println(c1.city);
		System.out.println(c1.cID);
		System.out.println(c1.mobile);
		
		c1.setDetail('F');
		c1.setDetail("Hyderabad");
		c1.setDetail(4921);
		c1.setDetail(896432157L);
		
		System.out.println(c1.gender);
		System.out.println(c1.city);
		System.out.println(c1.cID);
		System.out.println(c1.mobile);
	}
}

