package inheritance;
class Person{
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Student22 extends Person{
	private char grade;
	public void setGrade(char grade) { 
		this.grade = grade;
	}
	
	public char getGrade() {
		return grade;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("Grade: "+grade);
	}
	
	public void study() {
		System.out.println("Child is studying");
	}
}

class Teacher11 extends Person{
	private String subject;
	public void setSubject(String subject) {
		this.subject  = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("Subject: "+subject);
	}
	
	void teach() {
		System.out.println("Teacher is teaching students");
	}
}
public class Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student22 s = new Student22();
		s.setName("Abhinav");
		s.setAge(22);
		s.setGrade('A');
		s.displayInfo();
		s.study();
		System.out.println();
		
		Teacher11 t = new Teacher11();
		t.setName("Iswarya");
		t.setAge(38);
		t.displayInfo();
		t.teach();

	}

}
