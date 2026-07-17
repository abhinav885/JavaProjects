package arraysmodule;

import java.util.Scanner;

public class SquareArray {
	static int[] CreateArray(int[] ar) {
		int[] result = new int[ar.length];
		for (int i = 0; i < ar.length; i++) 
		{
			result[i] = ar[i]*ar[i];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i] = sc.nextInt();
		}
		int[] result = CreateArray(ar);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		sc.close();
	}

}
