package Patient.dao;

import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Patient.model.Patient;


public class PatientDao {
	 private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	 public void save(Patient patient) {
		 Transaction tx = null;     // use import hibernate transaction
		 try(Session session = sessionFactory.openSession())
		 {
			 tx = session.beginTransaction();
			 session.save(patient);
			 tx.commit();
		 }catch(Exception e) {
			 if(tx != null) {
				 tx.rollback();
			 }
		 }
	 }
	 

		public void update(Patient patient) {
			Transaction tx = null;
			try(Session session = sessionFactory.openSession())
			{
				tx = session.beginTransaction();
				session.saveOrUpdate(patient);
				tx.commit();
			}catch(Exception e) {
				if (tx != null) {
					tx.rollback();
				}
			}
		}
		
		
		public Patient getById(int id) {
			Transaction tx = null;
			Patient patient  = null;
			try(Session session =sessionFactory.openSession()){
				tx = session.beginTransaction();
				patient = session.get(Patient.class,id);
				tx.commit();
			}catch(Exception e) {
				if(tx != null) {
					tx.rollback();
				}
			}
			return patient;
		}
		
		
		public void delete(int id) {
			Transaction tx = null;
			Patient patient = null;
			try(Session session = sessionFactory.openSession()){
				tx = session.beginTransaction();
				session.delete(patient);
				tx.commit();
			}catch(Exception e) {
				if(tx != null) {
					tx.rollback();
				}
			}
		}
		
		
		@SuppressWarnings("unchecked")
	    public List < Patient > getAll() 
		{
	        Transaction transaction = null;
	        List < Patient > patient = null;
	        try (Session session = sessionFactory.openSession()) 
	        {
	            transaction = session.beginTransaction();
	            patient = session.createQuery("from User").list();
	            //user = session.load(User.class, id);
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	        }
	        return patient;
	    }
		
		
		
	 
}
