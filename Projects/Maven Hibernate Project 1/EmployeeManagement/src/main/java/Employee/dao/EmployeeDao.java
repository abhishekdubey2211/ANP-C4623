package Employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Employee.model.Employee;
import Employee.util.HibernateUtil;


public class EmployeeDao implements IEmployeeDao {
	

	@Override
	public void saveEmployee(Employee employee) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            transaction = session.beginTransaction();
            session.save(employee);
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
	public void updateEmployee(Employee employee) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(employee);
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
	public Employee getEmployeeById(long id) 
	{
        Transaction transaction = null;
        Employee employee = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            employee = session.get(Employee.class, id);
            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
        return employee;
    }

	@Override
	@SuppressWarnings("unchecked")
    public List < Employee > getAllEmployees() 
	{
        Transaction transaction = null;
        List < Employee > employees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            employees = session.createQuery("from Employee").list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return employees;
    }

	@Override
	public void deleteEmployee(int id) {
        Transaction transaction = null;
        Employee employee = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            employee = session.get(Employee.class, id);
            session.delete(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
            }
        }
    }
}
