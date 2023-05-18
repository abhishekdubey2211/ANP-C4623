package student.repesotary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student.entity.StudentDetail;

@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetail , Long>{
//	List<StudentDetail> findByid(String id);

}
