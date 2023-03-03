package corejava;


//creating GraduateStudent class inheriting Student
public class GraduateStudent extends Student
{
//	fields
	private String advisor;
	private String thisisTopic;
	
	
	
	//creating parameterized constructor
	public GraduateStudent(String name, int age, int studentId, String major, String advisor, String thisisTopic) 
	{
		super(name, age, studentId, major);
		this.advisor = advisor;
		this.thisisTopic = thisisTopic;
	}


	//	using getters and sitters
	public String getAdvisor() 
	{
		return advisor;
	}
	public void setAdvisor(String advisor) 
	{
		this.advisor = advisor;
	}
	public String getThisisTopic() 
	{
		return thisisTopic;
	}
	public void setThisisTopic(String thisisTopic) 
	{
		this.thisisTopic = thisisTopic;
	}
	
	
//	creating display method
	public void display() 
	{
		System.out.println("Name :"+getName()+"\nAge :"+getAge());
		System.out.println("Student id :"+ getStudentId()+"\nMajor  :"+getMajor());
		System.out.println("Advisor : "+ getAdvisor()+"\nThis is Student Project Topic  : "+getThisisTopic());
	}
}




//CREATING TESTER CLASS
class PersonStudentGraduateTester
{
	public static void main(String[] args)
	{
		GraduateStudent gs = new GraduateStudent("Abhishek",22,10023,"TYBSCIT","Prof.Anju","E-COMMERCE WEBSITE With JAVA ANGULAR");
		gs.display();
	}
}