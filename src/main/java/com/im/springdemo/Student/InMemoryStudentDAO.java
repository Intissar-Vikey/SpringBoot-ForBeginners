package com.im.springdemo.Student;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {

    private final List<Student> students = new ArrayList<Student>();
    public List<Student> getAllStudent() {
        return students;
    }
    public Student findByEmail(String email) {
        return students.stream().
            filter(s->email.equals(s.getEmail()))
            .findFirst()
            .orElse(null)
            ;
    }
    public Student save(Student s) {
        students.add(s);
        return s;
    }
    public void delete(String email) {
        var studentToRemove = findByEmail(email);
        if (studentToRemove!=null) students.remove(studentToRemove);
    }


    public Student updateStudent(Student s) {

        var studentIndex = IntStream.range(0,students.size())
            .filter(index->students.get(index).getEmail().equals(s.getEmail()))
            .findFirst()
            .orElse(-1);

        if (studentIndex!= -1)
        {
            students.set(studentIndex,s);
            return s;
        }
        return null;
    }
}
