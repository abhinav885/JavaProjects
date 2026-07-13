package encapsulation;
class Employee1
{
	private int cid;
	private String cname;
	private long cnumber;
	
	public Employee1()
	{
		cname = "Rahul";
	}
	
	public Employee1(int cid)
	{
		this();
		this.cid = cid;
	}
	
	public Employee1(int cid,String cname,long cnumber)
	{
		this(cid);
	}
	
	public int getCid()
	{
		return cid;
	}
	
	public String getCname()
	{
		return cname;
	}
	
	public long getCnumber()
	{
		return cnumber;
	}
}
public class ConstructorChaining 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee1 e = new Employee1(101,"megha",225343431L);
		System.out.println(e.getCid());
		System.out.println(e.getCname());
		System.out.println(e.getCnumber());
	}
}
