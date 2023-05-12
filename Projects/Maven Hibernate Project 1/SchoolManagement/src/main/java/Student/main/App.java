package Student.main;

import Student.model.Student;
import Student.dao.*;

public class App {
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();

		StudentDao dao  = new StudentDao();
		
		student.setSname("Abhishek");
		student.setLname("Dubey");
		student.setSsc_percent(86.40F);
		student.setEmail("abhi@gmail.com");
		student.setContact(885001456);
		
		student2.setSname("AMIT");
		student2.setLname("Dubey");
		student2.setSsc_percent(85.40F);
		student2.setEmail("aMIT@gmail.com");
		student2.setContact(892873477);
		
		
		dao.save(student);
		dao.save(student2);
		student.setSname("Shivam");
		dao.update(student);
		
		
		dao.delete(5);
		
	}
}
