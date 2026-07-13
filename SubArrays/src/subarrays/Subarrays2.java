package subarrays;

import java.util.Scanner;

public class Subarrays2 
{
	static void subarray(int[] ar,int size)
	{
		for(int i=0;i<=ar.length-size;i++)
		{
			int sum = 0;
			for(int j=i;j<i+size;j++)
			{
				sum = sum+ar[j];
			}
			System.out.println(sum);
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
		int size = sc.nextInt();
		subarray(ar,size);
		sc.close();
	}

}
