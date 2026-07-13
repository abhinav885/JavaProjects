package subarrays;

import java.util.Scanner;

public class MaximumProductSubarray 
{
	static int product(int[] ar)
	{
		int maxproduct = ar[0];
		int prefix = 1;
		int suffix = 1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(prefix==0)
			{
				prefix = 1;
			}
			else if(suffix == 0)
			{
				suffix = 1;
			}
			prefix = prefix * ar[i];
			suffix = suffix * ar[ar.length-i-1];
			if(prefix>maxproduct)
			{
				maxproduct = prefix;
			}
			if(suffix>maxproduct)
			{
				maxproduct = suffix;
			}
		}
		return maxproduct;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i] = sc.nextInt();
		}
		int res = product(ar);
		System.out.print(res);
		sc.close();

	}

}
