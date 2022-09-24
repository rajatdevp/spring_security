package com.spring_security.student.controller;

import com.spring_security.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/student")
public class StudentController {
private static   List<Student> studentList= Arrays.asList(
        new Student(1,"Rajat"),
        new Student(2,"Rajat"),
        new Student(3,"Rajat"),
        new Student(4,"Rajat"),
        new Student(5,"Rajat"),
        new Student(5,"Rajat")

);


    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable("id")  Integer id) throws Exception {
        return studentList.stream().filter(student -> student.getStudentId().equals(id)).findFirst().
                orElseThrow(()->new IllegalStateException("Student ID : "+id+" not found"));
    }

    @GetMapping("/all")
    public List<Student> getAllStudent() throws Exception {
        return studentList.stream().collect(Collectors.toList());
    }
}
