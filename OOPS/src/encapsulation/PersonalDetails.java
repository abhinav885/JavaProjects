package encapsulation;

public class PersonalDetails
{
	private String name;
	private int age;
	
	public void setName(String Newname)
	{
		name = Newname;
	}
	
	public void setAge(int Newage)
	{
		if(Newage>0)
		{
			age = Newage;
		}
		else
		{
			System.out.println("Invalid Age");
			System.exit(0);
		}
	}
	
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PersonalDetails p1 = new PersonalDetails();
		p1.setName("Abhinav");
		p1.setAge(22);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}

