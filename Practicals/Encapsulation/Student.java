package corejava;

public class Student extends Person {
	//fields
		private int studentId;
		private String major;
		

//		creating getters and setters
		
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getMajor() {
			return major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		
		
		
		// creating display method
		public void display() 
		{
			System.out.println("Student id  : :"+ getStudentId()+"\nMajor  :"+getMajor());
		}
}
