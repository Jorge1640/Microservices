package com.microservice.student.microservicestudent.service;

import com.microservice.student.microservicestudent.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findByidCourse(Long idCourse);
}
