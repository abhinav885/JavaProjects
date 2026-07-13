package assignment;
import java.util.Scanner;
public class Square
{
	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
		int Side = scan.nextInt();
		int perimeter = Side * 4;
		System.out.println(perimeter);
		scan.close();
	}
}
