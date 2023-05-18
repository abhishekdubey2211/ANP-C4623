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

import student.entity.StudentDetail;
import student.service.StudentDetailService;


@RestController
@RequestMapping("/studentDetails")
public class StudentDetailController {

	
	@Autowired
	private StudentDetailService studentDetailService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public StudentDetail create(@RequestBody StudentDetail studentDetail) 
	{
		return studentDetailService.save(studentDetail);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<StudentDetail> read() {
		return studentDetailService.getAllStudentDetails();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public StudentDetail read(@PathVariable Long id) {
		return studentDetailService.getStudentDetailById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		studentDetailService.deleteStudentDetail(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public StudentDetail update(@PathVariable Long id, @RequestBody StudentDetail studentDetail) {
		return studentDetailService.updateStudentDetail(studentDetail, id);
	}
}
