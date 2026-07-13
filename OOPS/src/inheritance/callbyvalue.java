package inheritance;

public class callbyvalue 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x = 4;
		int y = 5;
		System.out.println(x+" , "+y);
		add(x,y);
		System.out.println(x+" , "+y);

	}
	static void add(int x,int y)
	{
		x = x+10;
		y = y+10;
	}

}
