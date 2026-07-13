package patterns;
import java.util.Scanner;
public class Rectanularpattern3
{
	static void patternprint3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int count = i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		patternprint3(n);
		sc.close();
	}

}
