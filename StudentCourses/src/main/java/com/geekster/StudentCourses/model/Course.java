package com.geekster.StudentCourses.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CourseTable") // will see this in DB
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private Integer courseDurationInMonths;
    private Double courseFee;

    @Enumerated(EnumType.STRING)
    private CourseType courseType;

//    @OneToOne(cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_course_course_id")
    private List<Student> student;
}
