package com.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.employee.model.EmployeeDetail;

import EmployeeUtil.HibernateUtil;
public class EmployeeDetailDao{
	public void saveEmployeeDetail(EmployeeDetail employeeDetail) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())
        {
            // start the transaction
            transaction = session.beginTransaction();

            // save employeeDetail object
            session.save(employeeDetail);

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
	public void updateEmployeeDetail(EmployeeDetail employeeDetail) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save employeeDetail object
            session.saveOrUpdate(employeeDetail);

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
	public EmployeeDetail getEmployeeDetailById(long id) 
	{
        Transaction transaction = null;
        EmployeeDetail employeeDetail = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get employeeDetail object
            employeeDetail = session.get(EmployeeDetail.class, id);
            //employeeDetail = session.load(EmployeeDetail.class, id);
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
        return employeeDetail;
    }
	//indicates the named complier warning should be suppressed
	@SuppressWarnings("unchecked")
    public List < EmployeeDetail > getAllEmployeeDetails() 
	{
        Transaction transaction = null;
        List < EmployeeDetail > employeeDetails = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get employeeDetails
            employeeDetails = session.createQuery("from EmployeeDetail").list();
            //employeeDetail = session.load(EmployeeDetail.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return employeeDetails;
    }
	public void deleteEmployeeDetail(int id) {
        Transaction transaction = null;
        EmployeeDetail employeeDetail = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            employeeDetail = session.get(EmployeeDetail.class, id);
            // get employeeDetail object
            session.delete(employeeDetail);
            //employeeDetail = session.load(EmployeeDetail.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
               // transaction.rollback();
            }
        }
    }

}