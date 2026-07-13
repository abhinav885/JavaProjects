package subarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedReversingOrder 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar  = new int[n];
		
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i] = scan.nextInt();
		}
		
		int[] temp =new int[ar.length]; 
		
		for(int i=0; i<ar.length;i++)
		{
			temp[i] = ar[i];
		}
		
		Arrays.sort(temp);
		int i;
		int start  = -1;
		int end  = -1;
		
		for (i = 0; i < ar.length; i++) 
		{
			if(ar[i]!=temp[i])
			{
				start = i;
				break;
			}
		}
		
		for (i = ar.length-1; i>=0; i--) 
		{
			if(ar[i]!=temp[i])
			{
				end  = i;
				break;
			}
		}
		
		if(start==-1)
		{
			System.out.println("Yes");
			return;
		}
		
		while(start<end)
		{
			int tempval = ar[start];
			ar[start] = ar[end];
			ar[end] = tempval;
			start++;
			end--;
		}
		
		if(Arrays.equals(ar,temp))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		scan.close();
	}
}
