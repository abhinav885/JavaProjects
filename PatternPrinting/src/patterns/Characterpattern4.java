package patterns;
import java.util.Scanner;
public class Characterpattern4
{
	static void printpattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				char ch = (char)('E'-j+1);
				//System.out.print((char)(j+64)+" ");
				System.out.print(ch+" ");
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
