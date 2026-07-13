package patterns;
import java.util.Scanner;
public class RightAngledpattern2 
{
	static void patternprint(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			patternprint(n);
			sc.close();
		}
}
