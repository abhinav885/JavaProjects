package patterns;
import java.util.Scanner;
public class RightAngledHollow
{
	static void print(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i || i==n-1)
				{
					System.out.print(j+1+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
		sc.close();
	}

}
