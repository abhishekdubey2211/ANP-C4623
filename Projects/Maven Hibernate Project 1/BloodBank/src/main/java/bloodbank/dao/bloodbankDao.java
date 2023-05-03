package bloodbank.dao;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import bloodbank.model.Bloodbank;

public class bloodbankDao implements IbloodbankDao {
	private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    
	@Override
	public void save(Bloodbank bloodbank) {
		Transaction tx = null;   //always import transaaction for hibernate
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.save(bloodbank);
			tx.commit();
		}catch(Exception e) 
		{
			if (tx != null) {
				tx.rollback();
			}
		}
	}
	
	
	public void update(Bloodbank bloodbank) {
		Transaction tx = null;
		try(Session session = sessionFactory.openSession())
		{
			tx = session.beginTransaction();
			session.saveOrUpdate(bloodbank);
			tx.commit();
		}catch(Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		}
	}
	
	
	public Bloodbank getById(int id) {
		Transaction tx = null;
		Bloodbank bloodbank  = null;
		try(Session session =sessionFactory.openSession()){
			tx = session.beginTransaction();
			bloodbank = session.get(Bloodbank.class,id);
			tx.commit();
		}catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
		}
		return bloodbank;
	}
	
	
	public void delete(int id) {
		Transaction tx = null;
		Bloodbank bloodbank = null;
		try(Session session = sessionFactory.openSession()){
			tx = session.beginTransaction();
			session.delete(bloodbank);
			tx.commit();
		}catch(Exception e) {
			if(tx != null) {
				tx.rollback();
			}
		}
	}
	
	
	@SuppressWarnings("unchecked")
    public List < Bloodbank > getAll() 
	{
        Transaction transaction = null;
        List < Bloodbank > bloodbank = null;
        try (Session session = sessionFactory.openSession()) 
        {
            transaction = session.beginTransaction();
            bloodbank = session.createQuery("from User").list();
            //user = session.load(User.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return bloodbank;
    }
	
	
	
}
