import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Student.model.Student;
import junit.framework.*;

class StudentTest {

	@Test
	public void studentTest() {
		Student student = new Student();
		student.setSname("Abhishek");
		student.setLname("Dubey");
		student.setSsc_percent(86.40F);
		student.setEmail("abhi@gmail.com");
		student.setContact(885001456);
		
		Assert.assertEquals("Abhishek",student.getSname());
		Assert.assertEquals(885001456,student.getContact());
	}

	public void checkdelete() {
		Student student = new Student();
		
	}
}

