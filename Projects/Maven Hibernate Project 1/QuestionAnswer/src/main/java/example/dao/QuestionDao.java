package example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.model.Question;


public class QuestionDao {
private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public void save(Question question)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.save(question);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}
	
	

	public void update(Question question)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.saveOrUpdate(question);
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
		Question question = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			question = session.get(Question.class,id);
			session.delete(question);
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
		Question question = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			question = session.get(Question.class,id);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}


	@SuppressWarnings("unchecked")
	public List <Question> getAll()
	{
		Transaction tx = null;
		List<Question> question = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			question = session.createQuery("from Question").list();
			session.save(question);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
		return question;
	}
}
