package com.im.springdemo.Student;


import java.util.List;

public interface StudentService {

     Student saveStudent (Student s);
     List<Student> findAllStudent();
     Student findStudentByEmail(String email);
     void deleteStudent(String email);
     Student updateStudent (Student s);

}
