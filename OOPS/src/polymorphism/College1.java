package polymorphism;
class College{
	private String collegeName;

	public College(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeName() {
		return collegeName;
	}
}

class Student2{
	private String sName;
	private College college;//Association
	
	public Student2(String sName, College college) {
		super();
		this.sName = sName;
		this.college = college;
	}
	
	public void display() {
		System.out.println("CollegeName: "+college.getCollegeName());
		System.out.println("Student Name: "+sName);
	}
	
}
public class College1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College("cms");
		Student2 s = new Student2("Abhinav",c);
		s.display();

	}

}
