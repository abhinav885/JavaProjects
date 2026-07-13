package assignment;

public class Loop3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean cond = false;
		for(int i=0; i<10 && !cond;i++)
		{
			System.out.println(i);
			if(i==5)
				cond = true;
		}
	}

}
