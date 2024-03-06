package com.microservice.course.microservicecourse.services;

import com.microservice.course.microservicecourse.entities.Course;
import com.microservice.course.microservicecourse.http.request.response.StudentByCourseResponse;

import java.util.List;


public interface ICourseService{

    List<Course> findAll();
    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);




}
