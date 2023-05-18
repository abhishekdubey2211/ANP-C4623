package student.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import student.entity.Student;
import student.repesotary.StudentRepository;

//@Service allows to add business functionalities in your application

@Service
@RequiredArgsConstructor
public class StudentService
{
	
	private final StudentRepository studentRepository;
	
	public Student save(Student student) 
	{
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public Student getStudentById(Long id)
	{
		return studentRepository.findById(id).orElseThrow(()
		-> new RuntimeException("Student found for the id "+id));	
	}
	
	public Student updateStudent(Student student, Long id) 
	{
		Student existingStudent = studentRepository.findById(id).get();
		existingStudent.setId(student.getId());
		existingStudent.setFname(student.getFname());
		existingStudent.setLname(student.getLname());
		existingStudent.setContact(student.getContact());
		return studentRepository.save(existingStudent);
	}
	
	public void deleteStudent(Long id) {
		Student existingStudent = studentRepository.findById(id).get();
		studentRepository.delete(existingStudent);
		
	}
}