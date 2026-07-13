package patterns;
import java.util.Scanner;
public class Problem12 
{
	static void print(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
				{
					System.out.print((char)('A'+count)+" ");
				}
				else
				{
					System.out.print((char)('a'+count)+" ");
				}
				count++;
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
