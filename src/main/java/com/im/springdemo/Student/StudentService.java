package com.im.springdemo.Student;


import java.util.List;

public interface StudentService {

     Student save (Student s);
     List<Student> getAllStudent();
     Student findByEmail(String email);
     void delete(String email);
     Student updateStudent (Student s);

}
