package patterns;
import java.util.Scanner;
public class Characterpattern1
{
	static void printpattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				char ch = (char)('a' + i-1);
				System.out.print(ch + " ");
				//System.out.print((char)(j+96) + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		printpattern(n);
		sc.close();
	}

}
