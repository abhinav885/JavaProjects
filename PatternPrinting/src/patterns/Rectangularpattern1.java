package patterns;
import java.util.Scanner;
public class Rectangularpattern1
{
	static void pattern1(int n)
	{
		int count = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(count<10)
				{
					System.out.print("0");
				}
				System.out.print(count++ + " ");
				//count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern1(n);
		sc.close();
	}

}
