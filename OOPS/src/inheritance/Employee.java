package inheritance;

import java.util.Scanner;

class Employee1
{
	private String name;
	private double salary;
	
	public void setData(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public double getAnnualSalary()
	{
		return salary*12;
	}
}

class Manager extends Employee1
{
	private double bonus;
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	public double getBonus()
	{
		return bonus;
	}
	
	public double getAnnualSalary()
	{
		return (super.getAnnualSalary()+bonus);
	}
}

class Engineer extends Employee1
{
	private double overtime;
	
	public void setOverTime(double overtime)
	{
		this.overtime = overtime;
	}
	
	public double getOverTime()
	{
		return overtime;
	}
	
	public double getAnnualSalary()
	{
		return (super.getAnnualSalary()+overtime);
	}
	
	
}
public class Employee 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		m.setData("Ankit",75000);
		m.setBonus(25000);
		System.out.println(m.getAnnualSalary());
		sc.close();

	}

}
