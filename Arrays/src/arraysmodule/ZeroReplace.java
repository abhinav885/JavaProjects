package arraysmodule;

import java.util.Scanner;

public class ZeroReplace {
	static int[] CreateArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0) {
				ar[i] = 1;
			}
			else {
				ar[i] = 0;
			}
		}
		return ar;
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
