package polymorphism;
abstract class Plane6{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}

class Cargoplane extends Plane6{
	void takeOff() {
		System.out.println("Cargoplane is taking off");
	}
	
	void fly() {
		System.out.println("Plane is flying at low heights");
	}
	
	void land() {
		System.out.println("CargoPlane is landing");
	}
}

class PassengerPlane1 extends Plane6{
	void takeOff() {
		System.out.println("Passengerplane is taking off");
	}
	
	void fly() {
		System.out.println("Plane is flying at medium heights");
	}
	
	void land() {
		System.out.println("PassengerPlane is landing");
	}
}

class FighterPlane1 extends Plane6{
	void takeOff() {
		System.out.println("Fighterplane is taking off");
	}
	
	void fly() {
		System.out.println("Plane is flying at great heights");
	}
	
	void land() {
		System.out.println("FighterPlane is landing");
	}
}

class Airport{
	//static methods without object creation
	static void Permit(Plane6 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		System.out.println();
	}
	
	/*void Permit(Plane6 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		System.out.println();
	}*/
}
public class Plane5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cargoplane cp = new Cargoplane();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp = new FighterPlane1();
		/*Airport a = new Airport();
		a.Permit(cp);
		a.Permit(pp);
		a.Permit(fp);*/
		Airport.Permit(cp);//Accessed without making objects
		Airport.Permit(pp);
		Airport.Permit(fp);
	}

}
