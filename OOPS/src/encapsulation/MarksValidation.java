package encapsulation;
class Student25{
	private int sId;
	private int marks;
	public void setsId(int sId) {
		if(sId>0) {
		this.sId = sId;
	}
		else {
			System.out.println("Invalid Student ID");
		}
	}
	
	public int getsId() {
		return sId;
	}
	
	public void setMarks(int marks) {
		if(marks>=0 && marks<=100) {
			this.marks = marks;
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}
	
	public int getMarks() {
		return marks;
	}
}
public class MarksValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student25 s = new Student25();
		s.setsId(38);
		s.setMarks(-100);
		System.out.println(s.getsId());
		System.out.println(s.getMarks());
	}

}
