package inheritance;
class Test7
{
	int x,y;
	
	Test7()
	{
		//super();
		x = 100;
		y = 200;
	}
	
	Test7(int x,int y)
	{
		//super(x,y);
		this.x = x;
		this.y = y;
	}
}

class Test8 extends Test7
{
	int a,b;
	
	Test8()
	{
		//super();
		a = 300;
		b = 400;
	}
	
	Test8(int a,int b)
	{
		//super(a,b);
		this.a = a;
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
public class inheritance5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test8 t4 = new Test8();
		t4.disp();
		

	}

}
