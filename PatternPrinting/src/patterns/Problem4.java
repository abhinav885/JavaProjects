package patterns;
import java.util.Scanner;
public class Problem4 
{
	static void printpattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<(n-1-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i || i==n-1)
				{
					System.out.print("* ");
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
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printpattern(n);
		scan.close();

	}

}
