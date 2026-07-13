package polymorphism;
class Subject{
	private String SubjectName;
	private int code;
	
	public Subject(String SubjectName, int code) {
		super();
		this.SubjectName = SubjectName;
		this.code = code;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public int getCode() {
		return code;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public void setCode(int code) {
		this.code = code;
	}
}

class Teacher{
	private String TeacherName;
	private Subject subject;
	
	public Teacher(String TeacherName, Subject subject) {
		super();
		this.TeacherName = TeacherName;
		this.subject = subject;
	}

	public String getTeacherName() {
		return TeacherName;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	void display() {
		System.out.println("SubjectName: "+subject.getSubjectName());
		System.out.println("SubjectCode: "+subject.getCode());
		System.out.println("TeacherName: "+getTeacherName());
		System.out.println();
	}
	
}
public class Teacher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s = new Subject("TOC",3691);
		s.setCode(3551);
		Subject s1 = new Subject("AIML",3391);
		Teacher t = new Teacher("Pravin",s);
		Teacher t1 = new Teacher("Chitra",s1);
		t.display();
		t1.display();

	}

}
