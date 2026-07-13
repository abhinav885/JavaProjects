package patterns;
import java.util.Scanner;
public class Rectangularpattern4
{
	static void printpattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+1 + " ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print(i + " ");
			}
			if(i%2!=0)
			{
				System.out.print(i+1 + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printpattern(n);
		sc.close();
	}
}
