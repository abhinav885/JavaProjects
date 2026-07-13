package patterns;
import java.util.Scanner;
public class RightAngledpattern4
{
	static void patternprint(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=(n-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		patternprint(n);
		sc.close();
	}
}
