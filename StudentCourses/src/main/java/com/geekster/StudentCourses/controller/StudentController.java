package com.geekster.StudentCourses.controller;

import com.geekster.StudentCourses.model.Student;
import com.geekster.StudentCourses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    /*@GetMapping("/course/{id}")
    List<Student> getStudentByCourseId(@PathVariable Long id){
        return studentService.getStudentByCourseId(id);
    }*/


    @GetMapping("/course/{id}")
    List<Student> getStudentByCourseId(@PathVariable Long id){
        return studentService.getStudentByCourseId(id);
    }
}
