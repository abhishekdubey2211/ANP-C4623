package corejava;

public class GraduateStudent extends Student
{
//	fields
	private String advisor;
	private String thisisTopic;
	
	
	
//	ussing gitters and sitters
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public String getThisisTopic() {
		return thisisTopic;
	}
	public void setThisisTopic(String thisisTopic) {
		this.thisisTopic = thisisTopic;
	}
	
//	creating display method
	public void display() 
	{
		System.out.println("Advisor : "+ getAdvisor()+"\nThis is Student Project Topic  : "+getThisisTopic());
	}
}
