package encapsulation;
class Student20{
	private int id;
	private String name;
	private float marks;
	
	public void setData(int id,String name,float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public float getMarks() {
		return marks;
	}
}
public class Student50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student20 s = new Student20();
		s.setData(120,"Rahul",241.2f);
		System.out.println(s.getId());
		System.out.println(s.getMarks());
		System.out.println(s.getName());

	}

}
