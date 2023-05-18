package institutes.dao;

import java.util.List;
import institutes.model.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import institutes.Util.HibernateUtil;
import institutes.model.Teacher;

public class TeacherDao {
	// save Teacher
    // get All Teachers
    // get Teacher By Id
    // Update Teacher
    // Delete Teacher
	
	public void saveTeacher(Teacher teacher) 
	{
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            tx = session.beginTransaction();
            session.save(teacher);
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
	
	
	
	public void updateTeacher(Teacher teacher) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(teacher);
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
	
	
	public Teacher getTeacherById(int id) 
	{
        Transaction transaction = null;
        Teacher teacher = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            teacher = session.get(Teacher.class, id);
            System.out.println("teacher id = "+teacher.getId()+" \nteacher first name = "+teacher.getTfname()+" \nteacher last name = "+teacher.getTlname()+" \nteacher subject = "+teacher.getSubject());
            //teacher = session.load(Teacher.class, id);            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
        return teacher;
    }
	//indicates the named complier warning should be suppressed
	@SuppressWarnings("unchecked")
    public List < Teacher > getAllTeachers() 
	{
        Transaction transaction = null;
        List < Teacher > teachers = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get teachers
            teachers = session.createQuery("from Teacher").list();
            for (Teacher teacher : teachers) {
//                System.out.println("ID: " + teacher.getId());
                System.out.println("Name: " + teacher.getTfname());
                System.out.println("Name: " + teacher.getTlname());
                System.out.println("Name: " + teacher.getSubject());
                // Add additional fields as needed
            }
            //teacher = session.load(Teacher.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return teachers;
    }
	public void deleteTeacher(long id) {
        Transaction transaction = null;
        Teacher teacher = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            teacher = session.get(Teacher.class, id);
            // get teacher object
            session.delete(teacher);
            //teacher = session.load(Teacher.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
               // transaction.rollback();
            }
        }
    }
}
