package abstraction;
abstract class Animal3{
	abstract void eat();
	abstract void sound();
}

class Lion extends Animal3{
	void eat() {
		System.out.println("Lion is eating Deer");
	}
	void sound() {
		System.out.println("Lion is roaring");
	}
}

class Elephant extends Animal3{
	void eat() {
		System.out.println("Elephant is eating banana's");
	}
	void sound() {
		System.out.println("Elephant is making huge sound");
	}
}

class Dog extends Animal3{
	void eat() {
		System.out.println("Dog is eating chicken");
	}
	void sound() {
		System.out.println("Dog is barking");
	}
}

class Animal10{
	void permit(Animal3 a) {
		a.eat();
		a.sound();
		System.out.println();
	}
}
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion();
		Elephant e = new Elephant();
		Dog d = new Dog();
		Animal10 a1 = new Animal10();
		a1.permit(l);
		a1.permit(e);
		a1.permit(d);
	}

}
