package assignment;
import java.util.Scanner;
public class Circumference
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		float pi   = 3.142f;
		float Circumference = 2 * pi * radius;
		System.out.printf("%.4f",Circumference);
		sc.close();
	}
}
