package student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import student.model.Student;

public class StudentDao 
{
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
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
	
	

	public void delete(int id)
	{
		Transaction tx = null;
		Student student = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			student = session.get(Student.class,id);
			session.delete(student);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}
	
	
	
	public void getById(long id)
	{
		Transaction tx = null;
		Student student = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			student = session.get(Student.class,id);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}


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