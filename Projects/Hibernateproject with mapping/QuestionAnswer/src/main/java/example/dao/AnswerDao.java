package example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.model.Answer;


public class AnswerDao {
private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public void save(Answer answer)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.save(answer);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}
	
	

	public void update(Answer answer)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.saveOrUpdate(answer);
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
		Answer answer = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			answer = session.get(Answer.class,id);
			session.delete(answer);
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
		Answer answer = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			answer = session.get(Answer.class,id);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}


	@SuppressWarnings("unchecked")
	public List <Answer> getAll()
	{
		Transaction tx = null;
		List<Answer> answer = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			answer = session.createQuery("from Answer").list();
			session.save(answer);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
		return answer;
	}
}
