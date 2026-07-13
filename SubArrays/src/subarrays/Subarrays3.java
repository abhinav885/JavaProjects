package subarrays;

import java.util.Scanner;

public class Subarrays3 
{
	static void count(int[] ar,int size,int k)
	{
		for(int i=0;i<=ar.length-size;i++)
		{
			int sum = 0;
			for(int j=i;j<i+size;j++)
			{
				sum = sum+ar[j];
			}
			if(sum==k)
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
			ar[i]  = sc.nextInt();
		}
		int size = sc.nextInt();
		int k = sc.nextInt();
		count(ar,size,k);
		sc.close();
	}

}
