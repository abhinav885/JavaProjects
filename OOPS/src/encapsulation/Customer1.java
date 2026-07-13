package encapsulation;

class Customer1 
{
	private int cId;
	private String cname;
	private long cnumber;
	
	public Customer1(int cId,String cname,long cnumber)
	{
		this.cId = cId;
		this.cname = cname;
		this.cnumber = cnumber;
	}
	
	public int getCId()
	{
		return cId;
	}
	
	public String getCname()
	{
		return cname;
	}
	
	public long getCNumber()
	{
		return cnumber;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer1 c = new Customer1(105,"Abhinav",8848481900L);
		System.out.println(c.getCId());
		System.out.println(c.getCname());
		System.out.println(c.getCNumber());

	}
}
