package subarrays;

import java.util.Scanner;

public class PrintingAllSubarrays
{
	static void subarrays(int[] ar,int size)
	{
		for (int i = 0; i <=ar.length-size; i++) 
		{
			for(int j = i;j<i+size;j++)
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
			subarrays(ar,size);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		printingallsubarrays(ar);
		scan.close();
	}

}
