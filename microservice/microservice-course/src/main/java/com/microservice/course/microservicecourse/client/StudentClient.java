package com.microservice.course.microservicecourse.client;

import com.microservice.course.microservicecourse.dto.StudentDTO;
import jakarta.ws.rs.Path;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8080/api/student")
public interface StudentClient {

    @GetMapping("/search-ny-course/{idCourse}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse);


}
