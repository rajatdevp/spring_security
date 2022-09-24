package com.spring_security.student.model;

public class Student {

     private Integer studentId;
     private String name;

     public Student(Integer studentId, String name) {
          this.studentId = studentId;
          this.name = name;
     }

     public void setStudentId(Integer studentId) {
          this.studentId = studentId;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Integer getStudentId() {
          return studentId;
     }

     public String getName() {
          return name;
     }
}
