package patterns;
import java.util.Scanner;
public class problem2
{
	static void printpattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int count = i;
			for(int j=1;j<=(n-i)+1;j++)
			{
				if(i==1)
				{
					System.out.print(count++ + " ");
				}
				else if(j==1)
				{
					System.out.print(i+" ");
				}
				else if(j==(n-i)+1)
				{
					System.out.print(n+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printpattern(n);
		scan.close();

	}

}
