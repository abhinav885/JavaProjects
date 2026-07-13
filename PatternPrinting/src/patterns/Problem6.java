package patterns;
import java.util.Scanner;
public class Problem6 
{
	static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=(n-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		print(n);
		scan.close();;

	}

}
