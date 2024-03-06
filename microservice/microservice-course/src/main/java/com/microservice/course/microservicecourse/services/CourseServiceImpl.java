package com.microservice.course.microservicecourse.services;

import com.microservice.course.microservicecourse.client.StudentClient;
import com.microservice.course.microservicecourse.dto.StudentDTO;
import com.microservice.course.microservicecourse.entities.Course;
import com.microservice.course.microservicecourse.http.request.response.StudentByCourseResponse;
import com.microservice.course.microservicecourse.persistence.IcourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    private IcourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }


    //consultar el curso
    @Override
    public StudentByCourseResponse findStudentsByIdCourse(Long idCourse) {
        //consulta el curso
        Course course = courseRepository.findById(idCourse).orElse(new Course());
        //obtener los estudiantes
        List<StudentDTO> studentDTOList = studentClient.findAllStudentByCourse(idCourse);
        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }




}
