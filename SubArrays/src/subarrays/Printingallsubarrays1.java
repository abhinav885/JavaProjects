package subarrays;

import java.util.Scanner;

public class Printingallsubarrays1 
{
	static void printsubarrays(int[] ar,int size)
	{
		for(int i=0;i<=ar.length-size;i++)
		{
			for(int j=i;j<i+size;j++)
			{
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	}
	
	static void printingallsubarrays(int[] ar)
	{
		for(int size = 1;size<=ar.length;size++)
		{
			for(int i=0;i<=ar.length-size;i++)
			{
				for(int j=i;j<i+size;j++)
				{
					System.out.print(ar[j]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
		printingallsubarrays(ar);
		sc.close();
	}

}
