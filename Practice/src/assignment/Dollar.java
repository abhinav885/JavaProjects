package assignment;
import java.util.Scanner;
public class Dollar
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int dollar = scan.nextInt();
		double rupees = dollar * 82.73;
		System.out.printf("%.5f",rupees);
		scan.close();
	}

}
