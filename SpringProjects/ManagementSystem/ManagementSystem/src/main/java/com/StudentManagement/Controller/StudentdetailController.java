package com.StudentManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.StudentManagement.entity.Studentdetail;
import com.StudentManagement.service.StudentdetailService;

@RestController
@RequestMapping("/studentdetail")
public class StudentdetailController 
{
	@Autowired
	private StudentdetailService studentservice;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Studentdetail create(@RequestBody Studentdetail studentdetail)
	{
		return studentservice.save(studentdetail);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public List<Studentdetail> read()
	{
		return studentservice.getAllStudent();
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/{id}")
	public Studentdetail read(@PathVariable Long id)
	{
		return studentservice.getStudentbyId(id);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id)
	{
		studentservice.deleteStudent(id);
	}
	
	public Studentdetail update(@PathVariable Long id,@RequestBody Studentdetail studentdetail)
	{
		return studentservice.updateStudent(studentdetail, id);
	}
}
