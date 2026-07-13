package assignment;
import java.util.Scanner;
public class multiplesof5
{
	static void multiples(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(5*i+" ");
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		multiples(n);
		sc.close();
	}

}
