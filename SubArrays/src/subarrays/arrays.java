package subarrays;

import java.util.Scanner;

public class arrays {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
	
		int arr[]= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==k) {
				System.out.println(i);
			}
		}
		scan.close();
		
		
	}
	
}
