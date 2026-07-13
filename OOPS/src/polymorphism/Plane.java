package polymorphism;
class Plane10{
	void fly() {
		System.out.println("Plane is flying");
	}
	
}

class Cargoplane1 extends Plane10{
	void fly() {
		System.out.println("Plane is flying at low heights");
	}
	
	void CarryCargo() {
		System.out.println("CargoPlane is carrying cargo");
	}
}

class PassengerPlane2 extends Plane10{
	void fly() {
		System.out.println("Plane is flying at medium heights");
	}
	
	void CarryPassenger() {
		System.out.println("Passenger plane is carrying passengers");
	}
}

class FighterPlane2 extends Plane10{
	void fly() {
		System.out.println("Plane is flying at great heights");
	}
	
	void carryWeapons() {
		System.out.println("FighterPlane is carrying weapons");
	}
}
public class Plane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargoplane1 cp = new Cargoplane1();
		PassengerPlane2 pp = new PassengerPlane2();
		FighterPlane2 fp = new FighterPlane2();
		
		Plane10 ref;
		ref = cp;
		ref.fly();
		((Cargoplane1)(ref)).CarryCargo();//downcasting
		System.out.println();
		
		ref = pp;
		ref.fly();
		((PassengerPlane2)(ref)).CarryPassenger();
		System.out.println();
		
		ref = fp;
		ref.fly();
		((FighterPlane2)(ref)).carryWeapons();
	}

}
