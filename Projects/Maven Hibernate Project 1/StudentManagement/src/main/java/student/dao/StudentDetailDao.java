package student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import student.model.StudentDetails;


public class StudentDetailDao {
private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public void save(StudentDetails sd1)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.save(sd1);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}
	
	

	public void update(StudentDetailDao studentDetailDao)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.saveOrUpdate(studentDetailDao);
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
		StudentDetailDao studentDetailDao = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			studentDetailDao = session.get(StudentDetailDao.class,id);
			session.delete(studentDetailDao);
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
		StudentDetailDao studentDetailDao = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			studentDetailDao = session.get(StudentDetailDao.class,id);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}


	@SuppressWarnings("unchecked")
	public List <StudentDetailDao> getAll()
	{
		Transaction tx = null;
		List<StudentDetailDao> studentDetailDao = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			studentDetailDao = session.createQuery("from StudentDetailDao").list();
			session.save(studentDetailDao);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
		return studentDetailDao;
	}
}
