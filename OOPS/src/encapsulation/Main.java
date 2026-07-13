package encapsulation;
class User
{
	private Integer id;
	private String userName;
	private String password;
	
	public User(Integer id,String userName,String password)
	{
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public User()
	{
		
	}
}	
	
	class UserBO
	{
		private User[] getUsers()
		{
			User[] users = new User[5];
			users[0] = new User(1,"Louis","BCDEF");
			users[1] = new User(2,"Messie","23456");
			users[2] = new User(3,"Steve","opefkt");
			users[3] = new User(4,"Kallis","23456778");
			users[4] = new User(5,"Wipro","AS%");
			return users;
		}
		
		private String encryptPassword(String password)
		{
			String res = "";
			for(int i=0;i<password.length();i++)
			{
				res = res + (char)(password.charAt(i)+1);
			}
			
			return res;
		}
		
		public boolean validate(String userName,String password)
		{
			User[] users = getUsers();
			for(int i=0;i<users.length;i++)
			{
				String un = users[i].getUserName();
				String pw = users[i].getPassword();
				if(un.equals(userName) && pw.equals(encryptPassword(password)))
				{
					return true;
				}
				
			}
			return false;
		}
	}

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		UserBO u = new UserBO();
		System.out.println(u.validate("Louis","ABCDE"));
		System.out.println(u.validate("Messie","12345"));
		//System.out.println(u.validate("Steve","opefkt"));

		

	}

}
