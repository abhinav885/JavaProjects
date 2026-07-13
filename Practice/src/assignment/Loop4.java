package assignment;

public class Loop4
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count = 0;
		boolean b = true;
		while(b)
		{
			System.out.print(count + " ");
			count++;
			if(count==4)
			{
				b = false;
			}
		}
	}

}
