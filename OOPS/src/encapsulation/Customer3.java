package encapsulation;

class Customer4
{
	//Default and Parameterized Constructor
	private int cid;
	private String cname;
	private long cnumber;
	
	public Customer4()
	{
		this(141,"rahul",22943439299L);
		//cid = 234;
		//cname = "Ajeef";
		//cnumber = 989534129L;
	}
	
	public Customer4(int cid,String cname,long cnumber)
	{
		this.cid     = cid;
		this.cname   = cname;
		this.cnumber = cnumber;
	}

	public int getcID()
	{
		return cid;
	}
	
	public String getcName()
	{
		return cname;
	}
	
	public long getcNumber()
	{
		return cnumber;
	}
	
}
public class Customer3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer4 c = new Customer4();
		System.out.println(c.getcID()+" "+c.getcName()+" "+c.getcNumber());
		Customer4 c1 = new Customer4(123,"arul",9291343156L);
		System.out.println(c1.getcID()+" "+c1.getcName()+" "+c1.getcNumber());


	}

}
