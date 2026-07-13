package patterns;

import java.util.Scanner;

public class Problem13 
{
	static void print(int n)
	{
		//Inverted Pyramid Pattern
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*(n-i)+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method 
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
		sc.close();

	}

}
