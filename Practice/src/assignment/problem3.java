package assignment;
import java.util.Scanner;
public class problem3 
{
	static void multiples(int n,int a,int b)
	{
		for(int i=a;i<n;i++)
		{
			if(i%a==0 || i%b==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		multiples(n,a,b);
		sc.close();
	}

}
