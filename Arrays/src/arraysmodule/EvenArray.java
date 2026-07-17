package arraysmodule;

import java.util.Scanner;

public class EvenArray {
	static int[] CreateArray(int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]%2==0) {
				count++;
			}
		}
		int index = 0;
		int[] even = new int[count];
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]%2==0) 
			{
				even[index] = ar[i];
				index++;
			}
		}
		return even;
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
		int[] even = CreateArray(ar);
		for (int i = 0; i < even.length; i++) 
		{
			System.out.print(even[i]+" ");
		}
		sc.close();
	}

}
