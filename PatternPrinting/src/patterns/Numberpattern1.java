package patterns;
import java.util.Scanner;
public class Numberpattern1
{
	static void numberpattern(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		numberpattern(n);
		sc.close();
	}

}
