package com.example.dao;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.example.model.User;


public class UserDao implements IUserDao
{
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    
	  public void saveUser(User user) {
	    Transaction tx = null;
	    try (Session session = sessionFactory.openSession()) 
	    {
	      tx = session.beginTransaction();
	      session.save(user);
	      tx.commit();
	    } catch (Exception e) {
	      if (tx != null) {
	        tx.rollback();
	      }
	      e.printStackTrace();
	    }
	  }
	  @Override
		public void updateUser(User user) 
		{
	        Transaction transaction = null;
	        try (Session session = sessionFactory.openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            // save user object
	            session.saveOrUpdate(user);

	            // commit the transaction
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
		@Override
		public User getUserById(long id) 
		{
	        Transaction transaction = null;
	        User user = null;
	        try (Session session = sessionFactory.openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            // get user object
	            user = session.get(User.class, id);
	            //user = session.load(User.class, id);
	            // commit the transaction
	            transaction.commit();
	        } 
	        catch (Exception e)
	        {
	            if (transaction != null)
	            {
	                transaction.rollback();
	            }
	        }
	        return user;
	    }
		//indicates the named complier warning should be suppressed
		@Override
		@SuppressWarnings("unchecked")
	    public List < User > getAllUsers() 
		{
	        Transaction transaction = null;
	        List < User > users = null;
	        try (Session session = sessionFactory.openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            // get users
	            users = session.createQuery("from User").list();
	            //user = session.load(User.class, id);
	            // commit the transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	        }
	        return users;
	    }
		@Override
		public void deleteUser(int id) {
	        Transaction transaction = null;
	        User user = null;
	        try (Session session = sessionFactory.openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            user = session.get(User.class, id);
	            // get user object
	            session.delete(user);
	            //user = session.load(User.class, id);
	            // commit the transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	               // transaction.rollback();
	            }
	        }
	    }
	}
