package patterns;

import java.util.Scanner;

public class Problem11
{
	static void print(int n)
	{
		char ch = 'A';
		//int count = 65;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				char chRev = (char)(ch+i-1);
				for(int j=1;j<=i;j++)
				{
					System.out.print(chRev-- +" ");
					ch++;
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
		sc.close();

	}

}
