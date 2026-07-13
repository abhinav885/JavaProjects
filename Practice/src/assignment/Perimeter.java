package assignment;
import java.util.Scanner;
public class Perimeter 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int width  = scan.nextInt();
		int perimeter = 2 *(length + width);
		System.out.println(perimeter);
		scan.close();
	}
}
