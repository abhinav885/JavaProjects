package inheritance;
class Test9
{
	int x,y;
	
	Test9()
	{
		x = 100;
		y = 200;
	}
	
	Test9(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
}

class Test10 extends Test9
{
	int a,b;
	
	Test10()
	{
		this(9,99);//Local chaining is possible only inside of same class and this method is also used in same class
		a = 300;
		b = 400;
	}
	
	Test10(int a,int b)
	{
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

public class CodeSnippet 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test10 t = new Test10();
		t.disp();
	}

}
