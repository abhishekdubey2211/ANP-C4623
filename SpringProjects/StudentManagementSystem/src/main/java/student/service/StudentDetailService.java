package student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import student.entity.StudentDetail;
import student.repesotary.StudentDetailRepository;

@Service
@RequiredArgsConstructor
public class StudentDetailService
{
	
	private final StudentDetailRepository studentDetailRepository;
	
	public StudentDetail save(StudentDetail studentDetail) 
	{
		return studentDetailRepository.save(studentDetail);
	}
	
	public List<StudentDetail> getAllStudentDetails() {
		return studentDetailRepository.findAll();
	}
	
	public StudentDetail getStudentDetailById(Long id)
	{
		return studentDetailRepository.findById(id).orElseThrow(()
		-> new RuntimeException("StudentDetail found for the id "+id));	
	}
	
	public StudentDetail updateStudentDetail(StudentDetail studentDetail, Long id) 
	{
		StudentDetail existingStudentDetail = studentDetailRepository.findById(id).get();
		existingStudentDetail.setId(studentDetail.getId());
		existingStudentDetail.setCgpa(studentDetail.getCgpa());
		existingStudentDetail.setCourse(studentDetail.getCourse());

		return studentDetailRepository.save(existingStudentDetail);
	}
	
	public void deleteStudentDetail(Long id) {
		StudentDetail existingStudentDetail = studentDetailRepository.findById(id).get();
		studentDetailRepository.delete(existingStudentDetail);
		
	}
}
