package assignment;
import java.util.Scanner;
class Demo
{
	void fun()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Connection is established");
		try
		{
			System.out.println("Enter a: ");
			int a = scanner.nextInt();
			System.out.println("Enter b: ");
			int b = scanner.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}
			System.out.println("Normal Termination");
			scanner.close();
		}
}
	public class ExceptionHandling
	{
	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Demo d  = new Demo();
			d.fun();
		}
	}
