package arraysmodule;

import java.util.Scanner;

public class SwappingFirstAndLastElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		for (int i = 0; i< ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		int temp = ar[0];
		ar[0] = ar[ar.length-1];
		ar[ar.length-1] = temp;
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		sc.close();

	}

}
