package patterns;
import java.util.Scanner;
public class printingpattern
{
	static void printpattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			//print numbers
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			//print spaces
			for(int k=1;k<=2*(n-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
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
