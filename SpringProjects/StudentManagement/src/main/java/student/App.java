package student;
import student.model.*;
import student.dao.*;
import java.util.Date;

public class App {
		public static void main(String[] args) {
			Address ad1 = new Address();
			Student s1 = new Student();
			StudentDetails sd1 = new StudentDetails();
			
			
			ad1.setAddress("Chitra Colony Chembur");
			ad1.setCity("khapoli");
			ad1.setState("Maharastra");
			ad1.setCountry("India");
			
			s1.setFname("sanjana");
			s1.setMname("rajesh");
			s1.setLname("tripathi");
			s1.setRollno(85697);
			s1.setX(8564);
			s1.setDate(new Date());
			
			sd1.setSSCpercent(45.43f);
			sd1.setHSCpercent(62.40f);
			sd1.setSalary(68200);
			s1.setStudent_details(sd1);
			
			AddressDao ad1dao = new AddressDao();
			StudentDao s1dao = new StudentDao();
			StudentDetailDao sd1dao = new StudentDetailDao();
			
			ad1dao.save(ad1);
			s1dao.save(s1);
			s1dao.getById(2);
//			sd1dao.save(sd1);
			
//			s1dao.getById(1);
			
		}
	
	
	
	


}
