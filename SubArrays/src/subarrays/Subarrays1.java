package subarrays;

import java.util.Scanner;

public class Subarrays1 {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar1 = new int[n];
		for (int i = 0; i < ar1.length; i++) 
		{
			ar1[i] = scan.nextInt();
		}
		int size = scan.nextInt();
		for (int i = 0; i <=ar1.length-size; i++) 
		{
			for (int j = i; j <i+size; j++)
			{
				System.out.print(ar1[j]+" ");
			}
			System.out.println();
		}
		scan.close();
		
	}

}
