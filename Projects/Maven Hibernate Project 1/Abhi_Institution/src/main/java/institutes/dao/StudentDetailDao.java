////method implementation of IStudentDetailDao interface
//
//package institutes.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import institutes.Util.HibernateUtil;
//import institutes.model.StudentDetail;
//
//public class StudentDetailDao 
//{
//	// save StudentDetail
//    // get All StudentDetails
//    // get StudentDetail By Id
//    // Update StudentDetail
//    // Delete StudentDetail
//	
//	public void saveStudentDetail(StudentDetail studentDetail) 
//	{
//        Transaction tx = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession())
//        {
//            // start the transaction
//            tx = session.beginTransaction();
//
//            // save studentDetail object
//            session.save(studentDetail);
//
//            // commit the transaction
//            tx.commit();
//        }
//        catch (Exception e) 
//        {
//            if (tx != null) 
//            {
//                tx.rollback();
//            }
//        }
//    }
//	public void updateStudentDetail(StudentDetail studentDetail) 
//	{
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            // start the transaction
//            transaction = session.beginTransaction();
//
//            // save studentDetail object
//            session.saveOrUpdate(studentDetail);
//
//            // commit the transaction
//            transaction.commit();
//        } 
//        catch (Exception e)
//        {
//            if (transaction != null)
//            {
//                transaction.rollback();
//            }
//        }
//    }
//	public StudentDetail getStudentDetailById(long id) 
//	{
//        Transaction transaction = null;
//        StudentDetail studentDetail = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            // start the transaction
//            transaction = session.beginTransaction();
//
//            // get studentDetail object
//            studentDetail = session.get(StudentDetail.class, id);
//            //studentDetail = session.load(StudentDetail.class, id);
//            // commit the transaction
//            transaction.commit();
//        } 
//        catch (Exception e)
//        {
//            if (transaction != null)
//            {
//                transaction.rollback();
//            }
//        }
//        return studentDetail;
//    }
//	//indicates the named complier warning should be suppressed
//	@SuppressWarnings("unchecked")
//    public List < StudentDetail > getAllStudentDetails() 
//	{
//        Transaction transaction = null;
//        List < StudentDetail > studentDetails = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            // start the transaction
//            transaction = session.beginTransaction();
//
//            // get studentDetails
//            studentDetails = session.createQuery("from StudentDetail").list();
//            //studentDetail = session.load(StudentDetail.class, id);
//            // commit the transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//        return studentDetails;
//    }
//	public void deleteStudentDetail(long id) {
//        Transaction transaction = null;
//        StudentDetail studentDetail = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            // start the transaction
//            transaction = session.beginTransaction();
//
//            studentDetail = session.get(StudentDetail.class, id);
//            // get studentDetail object
//            session.delete(studentDetail);
//            //studentDetail = session.load(StudentDetail.class, id);
//            // commit the transaction
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//               // transaction.rollback();
//            }
//        }
//    }
//}
