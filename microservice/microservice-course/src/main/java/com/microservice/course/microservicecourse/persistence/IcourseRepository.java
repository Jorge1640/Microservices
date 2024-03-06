package com.microservice.course.microservicecourse.persistence;

import com.microservice.course.microservicecourse.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IcourseRepository extends CrudRepository<Course, Long> {
}
