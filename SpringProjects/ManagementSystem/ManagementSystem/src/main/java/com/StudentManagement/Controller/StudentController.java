package com.StudentManagement.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagement.entity.Student;
import com.StudentManagement.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@Autowired
	private StudentService studentservice;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Student create(@RequestBody Student student)
	{
		return studentservice.save(student);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public List<Student> read()
	{
		return studentservice.getAllStudent();
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/{id}")
	public Student read(@PathVariable Long id)
	{
		return studentservice.getStudentById(id);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id)
	{
		studentservice.deleteStudent(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Student update(@PathVariable Long id , @RequestBody Student student)
	{
		return studentservice.updatestudent(student, id);
	}
}
