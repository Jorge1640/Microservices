package com.microservice.course.microservicecourse.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Builder
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String teacher;


}
