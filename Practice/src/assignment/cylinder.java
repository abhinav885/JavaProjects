package assignment;
import java.util.Scanner;
public class cylinder
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		int radius  = sc.nextInt();
		int height  = sc.nextInt();
		float pi    = 3.142f;
		double area  = 2 * pi * radius *(radius+height);
		System.out.printf("%.4f",area);
		sc.close();
	}
}
