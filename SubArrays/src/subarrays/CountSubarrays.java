package subarrays;

import java.util.Scanner;

public class CountSubarrays 
{
	public static int count(int[] ar,int size,int k)
	{
		int count = 0;
		for (int i = 0; i <= ar.length-size; i++) 
		{
			int sum = 0;
			for (int j = i; j <i+size; j++) 
			{
				sum = sum + ar[j];
			}
			if(sum==k)
			{
				count++;	
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]  = scan.nextInt();
		}
		int size = scan.nextInt();
		int k = scan.nextInt();
		int res = count(ar,size,k);
		System.out.println(res);
		scan.close();
	}
}
