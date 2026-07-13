package patterns;
import java.util.Scanner;
public class Rectangularpattern2
{
	static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i*j<10)
				{
					System.out.print("0");
				}
				System.out.print(i*j + " ");
			}
		  System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern2(n);
		sc.close();
	}

}
