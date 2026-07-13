package inheritance;
class EducationalInstitute
{
	void admitstudent()
	{
		System.out.println("Student is Present");
	}
	void ConductExam()
	{
		System.out.println("Exam has conducted");
	}
}
class School extends EducationalInstitute
{
	void admitstudent()
	{
		System.out.println("Student is Present");
	}
	void ConductExam()
	{
		System.out.println("Exam has conducted");
	}
	void FieldTrip()
	{
		System.out.println("Field Trip has got Conducted");
	}
}
class college extends EducationalInstitute
{
	void admitstudent()
	{
		System.out.println("Student is Present");
	}
	void ConductExam()
	{
		System.out.println("Exam has conducted");
	}
	void ConductProject()
	{
		System.out.println("Project has got Conducted");
	}
}
class University extends EducationalInstitute
{
	void admitstudent()
	{
		System.out.println("Student is Present");
	}
	void ConductExam()
	{
		System.out.println("Exam has conducted");
	}
	void ConductMarks()
	{
		System.out.println("Marks has got updated");
	}
}
public class student
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		School sc = new School();
		sc.admitstudent();
		sc.ConductExam();
		sc.FieldTrip();
		System.out.println();
		
		
		college cc = new college();
		cc.admitstudent();
		cc.ConductExam();
		cc.ConductProject();
		System.out.println();
		
		University uv = new University();
		uv.admitstudent();
		uv.ConductExam();
		uv.ConductMarks();
		System.out.println();
	}
	}
