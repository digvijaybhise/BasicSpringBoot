package com.geekster.StudentCourses.service;

import com.geekster.StudentCourses.model.Course;
import com.geekster.StudentCourses.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepository courseRepository;

    public void saveCourse(Course myCourse) {
        courseRepository.save(myCourse);
    }
}
