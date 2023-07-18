package com.im.springdemo.Student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
	public List<Student> findAllStudents() {
		return studentService.findAllStudent();
	}

	@RequestMapping("/{email}")
	public Student findStudentByEmail(@PathVariable String email) {
		return studentService.findStudentByEmail(email);
	}

	@PostMapping
	public void saveStudent(@RequestBody Student s) {
		studentService.saveStudent(s);
	}

	@PutMapping
	public void updatStudent(@RequestBody Student s) {
		studentService.updateStudent(s);
	}
	
    @DeleteMapping("/{email}")
	public void deleteStudent(@PathVariable("email") String email) {
		studentService.deleteStudent(email);
	}

}
