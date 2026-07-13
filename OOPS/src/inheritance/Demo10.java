package inheritance;
class Demo11
{
	//final int a = 10;
	int a = 10;
	void ChangeValue()
	{
		a = 40;
	}
}
public class Demo10 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo11 d = new Demo11();
		d.ChangeValue();
		System.out.println(d.a);

	}

}
