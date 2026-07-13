package patterns;

public class patternprinting5
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int count  = 1;
		for(int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
				count = 1;
			}
			else
			{
				count = 0;
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(count +" ");
				count = 1 - count;
			}
			System.out.println();
		}
	}

}
