package inheritance;
class Plane1
{
	final void fly()
	{
		System.out.println("Plane is flying");
	}
}

class CargoPlane1 extends Plane1
{
	void fly1()
	{
		System.out.println("Cargoplane");
	}
}
public class Demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CargoPlane1 cp = new CargoPlane1();
		cp.fly();
	}

}
