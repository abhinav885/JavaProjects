package assignment;

import java.util.Scanner;

class try1 extends Thread
{
	public void run()
	{
		System.out.println("1st task started");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = scanner.nextInt();
		System.out.println("Enter b: ");
		int b = scanner.nextInt();
		System.out.println(a+b);
		System.out.println("1st task termination");
	}
}
class try2 extends Thread
{
	public void run()
	{
		System.out.println("Second Task is started");
		for(int i=65;i<=90;i++) 
		{

			System.out.println((char)i);
			try 
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Second Task is Terminated");
}
}
class try3 extends Thread{
	public void run()
	{
		System.out.println("Third task is started");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Third task terminated");
		}
	}
public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try1 t1 = new try1();
		try2 t2 = new try2();
		try3 t3 = new try3();

		t1.start();
		t2.start();
		t3.start();
	}

}
