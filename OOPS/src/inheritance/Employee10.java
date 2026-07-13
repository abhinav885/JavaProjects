package inheritance;
class Department{
	private String deptName;
	private String location;
	
	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getLocation() {
		return location;
	}
	
}

class Employee11{
	private String empName;
	private double salary;
	private Department department;
	
	public Employee11(String empName, double salary, Department department) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}

	public Department getDepartment() {
		return department;
	}
	
	void display() {
		System.out.println("Employer name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("Department name: "+department.getDeptName());
		System.out.println("Location: "+department.getLocation());
		System.out.println();
		
	}
	
}
public class Employee10 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Department d1 = new Department("AIDS","Bengaluru");
		d1.setDeptName("MECH");
		Department d2 = new Department("CSE","Chennai");
		Employee11 e = new Employee11("Abhinav",125000,d1);
		e.display();
		Employee11 e1 = new Employee11("Salmesh",250000,d2);
		e1.display();
	}
}
