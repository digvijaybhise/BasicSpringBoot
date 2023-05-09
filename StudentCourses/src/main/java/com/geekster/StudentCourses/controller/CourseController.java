package com.geekster.StudentCourses.controller;

import com.geekster.StudentCourses.model.Course;
import com.geekster.StudentCourses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/")
    public void createCourse(@RequestBody Course myCourse){
        courseService.saveCourse(myCourse);
    }
}
