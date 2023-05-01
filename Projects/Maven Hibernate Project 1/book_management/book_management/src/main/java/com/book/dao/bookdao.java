package com.book.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.book.model.bookmngmt;
import com.book.util.HibernateUtil;

public class bookdao implements IBookdao
{
	public void addBook(bookmngmt books)
	{
		 Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession())
	        {
	        	transaction=session.beginTransaction();
	        	
	        	session.save(books);
	        	
	        	transaction.commit();
	        }
	        catch(Exception e)
	        {
	        	if(transaction!= null)
	        	{
	        		transaction.rollback();
	        	}
	        }
	}
	public void updateBook(bookmngmt books)
	{
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			
			session.saveOrUpdate(books);
			
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
		}
	}
	public bookmngmt getBooksbyId(long id)
	{
		Transaction transaction = null;
		bookmngmt books = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			books = session.get(bookmngmt.class, id);
			
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
			
		}
		return books;
	}
	
	@SuppressWarnings("unchecked")
	public List <bookmngmt> getallbooks()
	{
		Transaction transaction = null;
		List <bookmngmt> books = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			// start the transaction
            transaction = session.beginTransaction();

            // get students
            books = session.createQuery("from bookmngmt").list();
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
		}
		return books;
	}
	public void deleteBook(int id)
	{
		Transaction transaction = null;
		bookmngmt books = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			
			books = session.get(bookmngmt.class, id);
			
			session.delete(books);
			
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				//transaction.rollback();
			}
		}
	}
}
