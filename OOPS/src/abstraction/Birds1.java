package abstraction;
abstract class Bird{
	abstract void eat();
	abstract void fly();
}

abstract class Eagle extends Bird{
	void fly() {
		System.out.println("Eagle flies at great heights");
	}
}

class SerpentEagle extends Eagle{
	void eat() {
		System.out.println("Serpent Eagle hunts over mountains and eats");
	}
}

class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("Golden Eagle hunts over oceans and eats");
	}
}

class Animal1{
	static void permit(Bird e) {
		e.eat();
		e.fly();
	}
}
public class Birds1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerpentEagle s = new SerpentEagle();
		GoldenEagle g = new GoldenEagle();
		Animal1.permit(s);
		Animal1.permit(g);
	}

}
