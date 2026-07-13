package abstraction;
abstract class Bird2{
	abstract void eat();
}

abstract class FlyingBird extends Bird2{
	abstract void fly();
}

class Eagle1 extends FlyingBird{
	void eat() {
		System.out.println("Eagle eats meat");
	}
	void fly() {
		System.out.println("Eagle is flying");
	}
}

class Parrot extends FlyingBird{
	void eat() {
		System.out.println("Parrot eats small birds");
	}
	void fly() {
		System.out.println("parrot is flying");
	}
}

class Penguin extends Bird2{
	void eat() {
		System.out.println("Penguin is eating food");
	}
}

class Bird10{
	void permit(Bird2 b) {
		b.eat();
	}
	void permit1(FlyingBird f) {
		f.fly();
		System.out.println();
	}
}
public class Bird3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle1 e = new Eagle1();
		Parrot p = new Parrot();
		Penguin p1 = new Penguin();
		Bird10 b1 = new Bird10();
		b1.permit(e);
		b1.permit1(e);
		b1.permit(p);
		b1.permit1(p);
		b1.permit(p1);
		

	}

}
