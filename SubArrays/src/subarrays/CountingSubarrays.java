package subarrays;
import java.util.Scanner;

public class CountingSubarrays 
{
	public static int printAllsubarrays(int[] ar,int k)
	{
		int count=0;
		for (int size = 1; size <=ar.length; size++) 
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
					count++;
				}
			}
		}
	    return count;
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
		int k = sc.nextInt();
		int res  = printAllsubarrays(ar,k);
		System.out.println("res: "+res);
		sc.close();
	}
}
