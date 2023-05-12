package Student.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Student.model.Student;

public interface IStudentDao {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	void save(Student student);

	void update(Student student);

	void delete(int rollno);

	void getById(long rollno);

	List<Student> getAll();

}