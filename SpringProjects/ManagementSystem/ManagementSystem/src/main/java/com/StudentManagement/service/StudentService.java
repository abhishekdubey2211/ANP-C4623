package com.StudentManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentManagement.Repos.StudentRepos;
import com.StudentManagement.entity.Student;

import lombok.*;

@Service
@RequiredArgsConstructor
public class StudentService 
{
	private final StudentRepos studentrepo;
	
	public Student save(Student student)
	{
		return studentrepo.save(student);
	}
	
	public List<Student> getAllStudent() {
		return studentrepo.findAll();
	}
	
	public Student getStudentById(Long id)
	{
		return studentrepo.findById(id).orElseThrow(()
		-> new RuntimeException("Student found for the id "+id));	
	}
	
	public Student updatestudent(Student student, Long id) 
	{
		Student existingStudent = studentrepo.findById(id).get();
		existingStudent.setRollno(student.getRollno());
		existingStudent.setName(student.getName());
		existingStudent.setStudentdetail(student.getStudentdetail());
		
		return studentrepo.save(existingStudent);
	}
	
	public void deleteStudent(Long id) {
		Student existingStudent = studentrepo.findById(id).get();
		studentrepo.delete(existingStudent);
		
	}

}
