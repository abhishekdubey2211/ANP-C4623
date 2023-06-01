package student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import student.entity.Student;
import student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController
{
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Student create(@RequestBody Student student) 
	{
		return studentService.save(student);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Student> read() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Student read(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}
	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Student update(@PathVariable Long id, @RequestBody Student student) {
		return studentService.updateStudent(student, id);
	}
}
