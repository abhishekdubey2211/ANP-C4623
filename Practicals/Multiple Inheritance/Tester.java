package corejava;

public class Tester extends Student
{
	public static void main(String[] args)
	{
		

		//creating object of the student class
		Person p = new Person();
		//calling using objects and assigning values and displaying
		p.setName("Abhishek Dubey"); 
		p.setAge(21);
		p.display();
		
		
		
		//creating object of the parson class
		Student stu = new Student();
		stu.setMajor("Web Development With Java And Angular");
		stu.setStudentId(100568);
		stu.display();



		
		//creating object of the Graduate Student class
		GraduateStudent gs = new GraduateStudent();
		//calling using objects and assigning values and displaying
		gs.setAdvisor("Prof. Anju");
		gs.setThisisTopic("E-COMMERCE WEBDEVELOPMENT");
		gs.display();
	}
}
