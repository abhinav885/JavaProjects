package patterns;
import java.util.Scanner;
public class Problem3 
{
	static void printpattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<(n-1)-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
	     Scanner scan = new Scanner(System.in);
	     int n = scan.nextInt();
	     printpattern(n);
	     scan.close();
	}

}
