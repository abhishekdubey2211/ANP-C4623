package Student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Student.model.Student;


public class StudentDao implements IStudentDao {
	
	@Override
	public void save(Student student)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.save(student);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}
	
	
	@Override
	public void update(Student student)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.saveOrUpdate(student);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}
	
	
	@Override
	public void delete(int rollno)
	{
		Transaction tx = null;
		Student student = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			student = session.get(Student.class,rollno);
			session.delete(student);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}
	
	
	@Override
	public void getById(long rollno)
	{
		Transaction tx = null;
		Student student = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			student = session.get(Student.class,rollno);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List <Student> getAll()
	{
		Transaction tx = null;
		List<Student> student = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			student = session.createQuery("from Student").list();
			session.save(student);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
		return student;
	}
	
	
	
	

}
