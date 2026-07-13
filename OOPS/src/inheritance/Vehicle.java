package inheritance;
class Plane
{
	void takeOff()
	{
		System.out.println("Plane is ready to take off");
	}
	
	void fly()
	{
		System.out.println("Plane is flying");
	}
	
	void land()
	{
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane
{
	void fly()
	{
		System.out.println("CargoPlane is flying at low height");
	}
	
	void CarryCargo()
	{
		System.out.println("CargoPlane is carrying Cargo");
	}	
}

class PassengerPlane extends Plane
{
	void fly()
	{
		System.out.println("PassengerPlane is flying at medium height");
	}
	
	void CarryPassengers()
	{
		System.out.println("PassengerPlane is carrying passengers");
	}
}

class FighterPlane extends Plane
{
	void fly()
	{
		System.out.println("FighterPlane is flying at high heights");
	}
	
	void CarryWeapons()
	{
		System.out.println("FighterPlane is carrying weapons");
	}
}
public class Vehicle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CargoPlane c = new CargoPlane();
		c.takeOff();//Inherited methods
		c.fly();//overridden methods
		c.land();//Inherited methods
		c.CarryCargo();//specialized methods
		System.out.println();
		
		PassengerPlane p = new PassengerPlane();
		p.takeOff();
		p.fly();
		p.land();
		p.CarryPassengers();
		System.out.println();
		
		FighterPlane f = new FighterPlane();
		f.takeOff();
		f.fly();
		f.land();
		f.CarryWeapons();
		System.out.println();

	}

}
