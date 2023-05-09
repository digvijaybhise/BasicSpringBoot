package com.geekster.StudentCourses.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "StudentTable") // will see this in DB
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private Integer studentAge;

    @Enumerated(EnumType.STRING)
    private Gender studentGender;
    private LocalDate studentDOB;

}
