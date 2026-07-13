package inheritance;
class Course{
	private String courseName;
	private int courseCode;
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getCourseCode() {
		return courseCode;
	}
	
	public void setCourse(String courseName,int courseCode) {
		this.courseName = courseName;
		this.courseCode = courseCode;
	}
	
	public String getDetails() {
		return("CourseName: "+getCourseName()+" "+"CourseCode: "+getCourseCode()+" ");
	}
}

class OnlineCourse extends Course{
	private String platform;

	public OnlineCourse(String courseName, int courseCode, String platform) {
		super.setCourse(courseName, courseCode);
		this.platform = platform;
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public String getDetails() {
		return(super.getDetails()+"Platform: "+getPlatform());
	}
}

class OfflineCourse extends Course{
	private String location;
	public OfflineCourse(String courseName,int courseCode,String location) {
		super.setCourse(courseName, courseCode);
		this.location = location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getDetails() {
		return(super.getDetails()+"Location: "+getLocation());
	}
}
public class CourseDetailsGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineCourse o = new OnlineCourse("Python",101,"TAI");
		o.setCourse("Java",100);
		o.setPlatform("Udemy");
		System.out.println(o.getDetails());
		System.out.println();
		
		OfflineCourse o1 = new OfflineCourse("DSA",102,"Class central");
		o1.setCourse("TOC",3691);
		o1.setLocation("BTM-301");
		System.out.println(o1.getDetails());

	}

}
