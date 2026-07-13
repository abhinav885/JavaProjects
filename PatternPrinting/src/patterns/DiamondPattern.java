package patterns;

import java.util.Scanner;

public class DiamondPattern 
{
	static void print(int n)
	{
		//Upper Half
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		//Lower Half
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("*"+" ");
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
