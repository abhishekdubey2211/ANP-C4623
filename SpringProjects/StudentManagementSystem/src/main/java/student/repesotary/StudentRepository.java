package student.repesotary;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	public List<Student> StudentBySemail(String semail);
}
