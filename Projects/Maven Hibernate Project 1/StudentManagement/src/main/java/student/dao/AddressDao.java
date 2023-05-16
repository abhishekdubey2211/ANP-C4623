package student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import student.model.Address;


public class AddressDao {

	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public void save(Address address)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.save(address);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}
	
	

	public void update(Address address)
	{
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.saveOrUpdate(address);
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
		Address address = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			address = session.get(Address.class,id);
			session.delete(address);
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
		Address address = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			address = session.get(Address.class,id);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
	}


	@SuppressWarnings("unchecked")
	public List <Address> getAll()
	{
		Transaction tx = null;
		List<Address> address = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			address = session.createQuery("from Address").list();
			session.save(address);
			tx.commit();
		}catch(Exception e) {
			if(tx!= null) 
			{
				tx.rollback();
			}
		}
		return address;
	}
}
