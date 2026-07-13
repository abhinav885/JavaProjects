package patterns;
import java.util.Scanner;
public class Numberpattern4
{
	static void numberpattern (int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		numberpattern(n);
		sc.close();
		
	}
}
