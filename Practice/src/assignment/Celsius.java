package assignment;
import java.util.Scanner;
public class Celsius
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int  celsius = scan.nextInt();
		float fahrenheit = (celsius*9.0f/5+32);
		System.out.printf("%.2f",fahrenheit);
		scan.close();
		
	}

}
