package encapsulation;

class Account1 
{
    private long balance;
    
    public void setData(long amt)
    {
    	if(amt>=0)
    	{
        	balance = amt;
    	}
    	else
    	{
    		System.out.println("Invalid Amount");
    		System.exit(0);
    	}
    }
    
    public long getData()
    {
    	return balance;
    }
    
}




public class Account
{
    	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account1 ac = new Account1();
		//ac.balance = 1000000000;
		//System.out.println(ac.balance);
		ac.setData(-10000000L);
		System.out.println(ac.getData());

	}

}
