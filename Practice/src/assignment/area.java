package assignment;
import java.util.Scanner;
public class area {

public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int r = scan.nextInt();
		double pi = 3.142;
		double area  = pi * r * r;
		System.out.printf("%.4f",area);
		scan.close();
	}
	}

