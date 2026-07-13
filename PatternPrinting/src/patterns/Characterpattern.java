package patterns;
import java.util.Scanner;
public class Characterpattern
{
	static void printpattern(int n)
	{
		int ch  = 65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)ch +" ");
			}
			ch++;
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
