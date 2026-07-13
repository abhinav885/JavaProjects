package subarrays;

import java.util.Scanner;

public class KadanesAlgorithm 
{
	static int maximum(int[] ar)
	{
		int sum = ar[0];
		int maxsum = ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(sum>=0)
			{
				sum = sum+ar[i];
			}
			else
			{
				sum = ar[i];
			}
			if(sum>maxsum)
			{
				maxsum = sum;
			}
		}
		return maxsum;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		int res = maximum(ar);
		System.out.print(res);
		sc.close();

	}

}
