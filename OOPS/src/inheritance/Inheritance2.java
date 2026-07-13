package inheritance;
class Test1 extends Object
{
	int x,y;
	Test1()
	{
		super();
		x = 100;
		y = 200;
	}
	
	Test1(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
}
class Test20 extends Test1
{
	int a,b;
	Test20()
	{
		super();
		a = 300;
		b = 400;
	}
	Test20(int a,int b)
	{
		this.a  = a;
		this.b = b;
	}
	void disp()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}
public class Inheritance2 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Test20 t2 = new Test20();
		t2.disp();
		
	}

}
