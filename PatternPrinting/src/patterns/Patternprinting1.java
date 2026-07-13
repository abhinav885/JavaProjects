package patterns;
import java.util.Scanner;
public class Patternprinting1
{
	static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int count = i;
			for(int j=1;j<=(n-i)+1;j++)
			{
				System.out.print(count++);
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
