package inheritance;

public class callbyreference 
{
	//there is no call by reference in java
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random r = new Random(4,5);
		System.out.println(r.x+" , "+r.y);
		
		add(r);
		
		System.out.println(r.x+" , "+r.y);

	}
	static void add(Random r1)
	{
		r1.x = r1.x+10;
		r1.y = r1.y+10;
	}

}
class Random
{
	int x;
	int y;
	Random(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
}
