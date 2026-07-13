package polymorphism;
class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("Dog is eating food");
	}
	void bark() {//specialized method
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal{
	void eat() {
		System.out.println("Cat is eating food");
	}
	void meow() {
		System.out.println("Cat is making sound");
	}
}
public class Animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		a = new Dog();//Upcasting
		a.eat();//Runtime Polymorphism
		//Dog d = (Dog)new Dog();
		//d.bark();
		//Cat c  =(Cat)new Cat();
		//c.meow():
		Dog d = (Dog)a;
		d.bark();
		
		a = new Cat();//upcasting
		a.eat();
			
		Cat c = (Cat)a;
		c.meow();
		
	}

}
