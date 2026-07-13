package encapsulation;

import java.util.Scanner;

class Restaurant
{
	private int id;
	private String name;
	private String email;
	private long pno;
	private String addr;
	
	public Restaurant(int id, String name, String email, long pno, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pno = pno;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public long getPno() {
		return pno;
	}

	public String getAddr() {
		return addr;
	}
}
public class RestaurantInformationManagementSystem 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rId = sc.nextInt();
		sc.nextLine();
		String rName = sc.nextLine();
		String rEmail = sc.nextLine();
		long rPno = sc.nextLong();
		sc.nextLine();
		String rAddr = sc.nextLine();
		Restaurant r = new Restaurant(rId,rName,rEmail,rPno,rAddr);
		System.out.println(r.getId());
		System.out.println(r.getName());
		System.out.println(r.getEmail());
		System.out.println(r.getPno());
		System.out.println(r.getAddr());
		sc.close();
	}
}
