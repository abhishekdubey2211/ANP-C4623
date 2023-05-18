package institutes;
import institutes.model.*;
import institutes.dao.*;
public class App 
{
    public static void main( String[] args )
    {
    	TeacherDao td =new TeacherDao();
    	Teacher t1 = new Teacher(1,150002,"sapna","chaudhary","biology");
    	Teacher t2 = new Teacher(2,150012,"rausni","jadav","chemistry");
    	Teacher t3 = new Teacher(3,150032,"sachin","rahane","maths");

    	StudentDetail sd1 = new StudentDetail(66.4f,95.92f,35850f);
    	StudentDetail sd2 = new StudentDetail(98.4f,75.65f,9600f);
    	StudentDetail sd3 = new StudentDetail(82.4f,65.62f,29600f);

 //adding data to student table
    	Student s1 = new Student(246,"amit","singhal","amit@123");
    	Student s2 = new Student(275,"sanju","DUBEY","samju@123");
    	Student s3 = new Student(248,"rakesh","jaiswal","rakesh@123");

 //embedding student details in student table
    	s1.setStudentDetail(sd1);
    	s2.setStudentDetail(sd2);
    	s3.setStudentDetail(sd3);
    	
    	StudentDao sdao = new StudentDao();
    	
//saving students data
    	sdao.saveStudent(s1);
    	sdao.saveStudent(s2);
    	sdao.saveStudent(s3);
    	td.saveTeacher(t1);
    	td.saveTeacher(t2);
    	td.saveTeacher(t3);
 //fetching all data at once   	
    	sdao.getAllStudents();
    	td.getAllTeachers();
 //fetching data with id 3
    	sdao.getStudentById(3);
    	td.getTeacherById(2);
    	
//deleting data with id 5
    	sdao.deleteStudent(5);
    	
    }
}
