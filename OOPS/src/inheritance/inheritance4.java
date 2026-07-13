package inheritance;
class Demo5
{
	//private int x;
	public Demo5()
	{
		//super();
		System.out.println("Demo1 constructor");
	}
}

class Demo6 extends Demo5
{
	//private int y;
	public Demo6()
	{
		//super();
		System.out.println("Demo2 constructor");
	}
}
public class inheritance4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo6 d2 = new Demo6();
		

	}

}
