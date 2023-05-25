package com.StudentManagement.service;

import com.StudentManagement.Repos.StudentdetailRepo;
import com.StudentManagement.entity.Studentdetail;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.*;

@Service
@RequiredArgsConstructor
public class StudentdetailService 
{
	private final StudentdetailRepo studentdetail;
	
	public Studentdetail save(Studentdetail student)
	{
		return studentdetail.save(student);
	}
	
	public List<Studentdetail> getAllStudent()
	{
		return studentdetail.findAll();
	}
	
	public Studentdetail getStudentbyId(Long id)
	{
		return studentdetail.findById(id).orElseThrow(()
				-> new RuntimeException("Studentdetail found for the id "+id));
	}
	
	public Studentdetail updateStudent(Studentdetail student,Long id)
	{
		Studentdetail existingStudent = studentdetail.findById(id).get();
		existingStudent.setCourse(student.getCourse());
		
		
		return studentdetail.save(existingStudent);
	}
	
	public void deleteStudent(Long id)
	{
		Studentdetail existingStudent= studentdetail.findById(id).get();
		studentdetail.delete(existingStudent);
	}
}
