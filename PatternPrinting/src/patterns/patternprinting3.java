package patterns;
import java.util.Scanner;
public class patternprinting3
{
	static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(n-i + " ");
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
