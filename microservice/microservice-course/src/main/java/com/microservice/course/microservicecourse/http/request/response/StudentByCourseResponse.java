package com.microservice.course.microservicecourse.http.request.response;

import com.microservice.course.microservicecourse.dto.StudentDTO;
import com.microservice.course.microservicecourse.entities.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {

    private String courseName;
    private String teacher;
    private List <StudentDTO> studentDTOList;
}
