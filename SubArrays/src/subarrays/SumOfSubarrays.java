package subarrays;

import java.util.Scanner;

public class SumOfSubarrays
{
	 public static void sum(int[] ar,int size)
	{
		for (int i = 0; i <= ar.length-size; i++) 
		{
			int sum = 0;
			for(int j=i;j<i+size;j++)
			{
				sum = sum + ar[j];
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar =new int[n];
		for (int i = 0; i < ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		int size = scan.nextInt();
		sum(ar,size);
		scan.close();

	}

}
