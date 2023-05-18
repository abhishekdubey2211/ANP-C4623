//method implementation of IStudentDao interface

package institutes.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import institutes.Util.HibernateUtil;
import institutes.model.Student;

public class StudentDao 
{
	// save Student
    // get All Students
    // get Student By Id
    // Update Student
    // Delete Student
	
	public void saveStudent(Student student) 
	{
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            tx = session.beginTransaction();
            session.save(student);
            tx.commit();
        }
        catch (Exception e) 
        {
            if (tx != null) 
            {
                tx.rollback();
            }
        }
    }
	
	
	
	public void updateStudent(Student student) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(student);
            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
    }
	
	
	public Student getStudentById(int id) 
	{
        Transaction transaction = null;
        Student student = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            student = session.get(Student.class, id);
            System.out.println("student id = "+student.getId()+" \nstudent first name = "+student.getFname()+" \nstudent last name = "+student.getLname()+" \nstudent email id = "+student.getEmail());
            //student = session.load(Student.class, id);            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
        return student;
    }
	//indicates the named complier warning should be suppressed
	@SuppressWarnings("unchecked")
    public List < Student > getAllStudents() 
	{
        Transaction transaction = null;
        List < Student > students = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get students
            students = session.createQuery("from Student").list();
            for (Student student : students) {
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getFname());
                System.out.println("Name: " + student.getLname());
                System.out.println("Name: " + student.getEmail());
                // Add additional fields as needed
            }
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return students;
    }
	public void deleteStudent(long id) {
        Transaction transaction = null;
        Student student = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            student = session.get(Student.class, id);
            // get student object
            session.delete(student);
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
               // transaction.rollback();
            }
        }
    }
}
