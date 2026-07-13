package polymorphism;
class Employee{
	void Work() {
		System.out.println("Employee is Working");
	}
}

class Developer extends Employee{
	void Work() {
		System.out.println("Developer is working");
	}
}

class Tester extends Employee{
	void Work() {
		System.out.println("Tester is working");
	}
}

class Manager extends Employee{
	void Work() {
		System.out.println("Manager is working");
	}
}
public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		e = new Developer();
		e.Work();
		e = new Tester();
		e.Work();
		e = new Manager();
		e.Work();
	}

}
