package inheritance;
class A{
	int x = 10;
}

class B extends A{
	int x = 20;
	void display() {
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class Exmp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.display();

	}

}
