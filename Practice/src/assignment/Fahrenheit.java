package assignment;
import java.util.Scanner;
public class Fahrenheit
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int fahrenheit = scan.nextInt();
		float celsius = (fahrenheit - 32)*5/9.0f;
		System.out.printf("%.4f",celsius);
		scan.close();
	}

}
