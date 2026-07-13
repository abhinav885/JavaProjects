package encapsulation;

class Customer5
{
	private int cid;
	private String cname;
	private long cnumber;
	
	public Customer5()
	{
		cid = 223;
		cname = "Abhinav";
		cnumber = 8848484910L;
	}
	
	public Customer5(int cid,String cname,long cnumber)
	{
		this();
		this.cid = cid;
		this.cname = cname;
		this.cnumber = cnumber;
	}
	
	public int getcId()
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
public class Customer2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer5 c = new Customer5(141,"athul",12345678L);
		System.out.println(c.getcId());		
		System.out.println(c.getcName());		
		System.out.println(c.getcNumber());		


	}

}
