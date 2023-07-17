package com.im.springdemo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    StudentService studentService;
   // @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping
    public List<Student> findAllStudents()
    {
        return studentService.getAllStudent();
    }

    public Student findStudentByEmail(String email)
    {return null;}

    public void saveStudent(Student s)
    {
        
    }



}
