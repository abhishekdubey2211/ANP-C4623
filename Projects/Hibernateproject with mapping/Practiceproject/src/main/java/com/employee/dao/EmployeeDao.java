package com.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.employee.model.Employee;

import EmployeeUtil.HibernateUtil;


public class EmployeeDao 
{
	
	public void saveEmployee(Employee employee) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            // start the transaction
            transaction = session.beginTransaction();

            // save employee object
            session.save(employee);

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
	public void updateEmployee(Employee employee) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save employee object
            session.saveOrUpdate(employee);

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
	public Employee getEmployeeById(long id) 
	{
        Transaction transaction = null;
        Employee employee = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get employee object
            employee = session.get(Employee.class, id);
            //employee = session.load(Employee.class, id);
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
        return employee;
    }
	//indicates the named complier warning should be suppressed
	@SuppressWarnings("unchecked")
    public List < Employee > getAllEmployees() 
	{
        Transaction transaction = null;
        List < Employee > employees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get employees
            employees = session.createQuery("from Employee").list();
            //employee = session.load(Employee.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return employees;
    }
	public void deleteEmployee(int id) {
        Transaction transaction = null;
        Employee employee = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            employee = session.get(Employee.class, id);
            // get employee object
            session.delete(employee);
            //employee = session.load(Employee.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
               // transaction.rollback();
            }
        }
    }
}
