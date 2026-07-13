package encapsulation;

import java.util.Scanner;

class Employee2
{
	private int empId;
	private String empName;
	private String empDesignation;
	private String empEmail;
	private long empPno;
	private double empSalary;
	
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	
	public void setEmpDesignation(String empDesignation)
	{
		this.empDesignation = empDesignation;
	}
	
	public String getEmpDesignation()
	{
		return empDesignation;
	}
	
	public void setEmpEmail(String empEmail)
	{
		this.empEmail = empEmail;
	}
	
	public String getEmpEmail()
	{
		return empEmail;
	}
	
	public void setEmpPno(long empPno)
	{
		this.empPno = empPno;
	}
	
	public long getEmpPno()
	{
		return empPno;
	}
	
	public void setEmpSalary(double empSalary)
	{
		this.empSalary = empSalary;
	}
	
	public double getEmpSalary()
	{
		return empSalary;
	}
}
public class Main1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee2 e = new Employee2();
		e.setEmpId(sc.nextInt());
		sc.nextLine();
		e.setEmpName(sc.nextLine());
		e.setEmpDesignation(sc.nextLine());
		e.setEmpEmail(sc.nextLine());
		e.setEmpPno(sc.nextLong());
		e.setEmpSalary(sc.nextDouble());
		System.out.println("Your Id is: "+e.getEmpId());
		System.out.println("Your Name is: "+e.getEmpName());
		System.out.println("Your Designation is: "+e.getEmpDesignation());
		System.out.println("Your Email is: "+e.getEmpEmail());
		System.out.println("Your Phone Number is: "+e.getEmpPno());
		System.out.println("Your Salary is: "+e.getEmpSalary());
		sc.close();
	}

}
