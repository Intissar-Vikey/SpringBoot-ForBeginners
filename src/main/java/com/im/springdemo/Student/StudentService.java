package com.im.springdemo.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudent()
    {
        return List.of(
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

        ) ;
    }


}
