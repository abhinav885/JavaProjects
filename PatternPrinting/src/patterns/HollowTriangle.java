package patterns;
import java.util.Scanner;
public class HollowTriangle
{
	static void patternprint(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(i==n ||i+j==n+1 ||j==(n+i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
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
