package patterns;
import java.util.Scanner;
public class patternprinting2 
{
	static void printpattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int count = 1;
			for(int j=1;j<=(2*i)-1;j++)
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
		printpattern(n);
		sc.close();
	}

}
