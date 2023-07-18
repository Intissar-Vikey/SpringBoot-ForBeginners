package com.im.springdemo.Student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDAO inMemoryStudentDAO;

    public InMemoryStudentService (InMemoryStudentDAO inMemoryStudentDAO){
        this.inMemoryStudentDAO = inMemoryStudentDAO;}
    
    @Override
    public List<Student> findAllStudent() {
        return inMemoryStudentDAO.getAllStudent();	
    /*	return List.of(
            new Student(
                "Intissar",
                "Mhamdi",
                LocalDate.of(1988, 1, 8),
                "intissar@gmail.com",
                34)
            ,
            new Student(
                "Anas",
                "Ayari",
                LocalDate.of(2020, 1, 8),
                "anas@gmail.com",
                3)

        ) ;*/
     }
    
    @Override
    public Student saveStudent(Student s) {
        return inMemoryStudentDAO.save(s);
    }
    @Override
    public Student findStudentByEmail(String email) {
    	
    	return inMemoryStudentDAO.findByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {  	
    	inMemoryStudentDAO.delete(email);
    }

    @Override
    public Student updateStudent(Student s) {
        return inMemoryStudentDAO.updateStudent(s);
    }
}
