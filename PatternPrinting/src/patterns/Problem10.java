package patterns;

import java.util.Scanner;

public class Problem10
{
	static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int count = i*(i+1)/2;
			for(int j=1;j<=i;j++)
			{
				System.out.print(count-j+1+" ");
				if(j<=i-1)
				{
					System.out.print("*");
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
		print(n);
		sc.close();

	}

}
