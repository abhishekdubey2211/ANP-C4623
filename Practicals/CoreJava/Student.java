package corejava;
// creating Student class inheriting Person class
public class Student extends Person
{

	//fields
			private int studentId;
			private String major;
			
			
			
			
	//creating parameterized constructor		
			public Student(String name, int age, int studentId, String major) 
			{
				super(name, age);
				this.studentId = studentId;
				this.major = major;
			}


		//creating getters and setters

			public int getStudentId() 
			{
				return studentId;
			}
			public void setStudentId(int studentId) 
			{
				this.studentId = studentId;
			}
			public String getMajor() 
			{
				return major;
			}
			public void setMajor(String major) 
			{
				this.major = major;
			}
			
	}
