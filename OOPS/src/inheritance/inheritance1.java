package inheritance;

	class plane
	{
		void takeoff()
		{
			System.out.println("Plane is Taken Off");
		}
		void fly()
		{
			System.out.println("Plane is Flying");
		}
		void land()
		{
			System.out.println("Plane is Landing");
		}
	}
	class cargoplane extends plane
	{
		void takeoff()
		{
			System.out.println("Plane is Taken Off");
		}
		void fly()
		{
			System.out.println("Plane is Flying at low height");
		}
		void land()
		{
			System.out.println("Plane is Landing");
		}
	}
	class PassengerPlane1 extends plane
	{
		void takeoff()
		{
			System.out.println("Plane is Taken Off");
		}
		void fly()
		{
			System.out.println("Plane is Flying at Medium height");
		}
		void land()
		{
			System.out.println("Plane is Landing");
		}
	}
	class FighterPlane1 extends plane
	{
		void takeoff()
		{
			System.out.println("Plane is Taken Off");
		}
		void fly()
		{
			System.out.println("Plane is Flying at larger height");
		}
		void land()
		{
			System.out.println("Plane is Landing");
		}
	}
	public class inheritance1
	{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		cargoplane cp = new cargoplane();
		cp.takeoff();
		cp.fly();
		cp.land();
		System.out.println();
		
		PassengerPlane1 pp = new PassengerPlane1();
		pp.takeoff();
		pp.fly();
		pp.land();
		System.out.println();
		
		FighterPlane1 fp = new FighterPlane1();
		fp.takeoff();
		fp.fly();
		fp.land();
		
	}

}
