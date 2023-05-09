package com.geekster.StudentCourses.service;

import com.geekster.StudentCourses.model.Course;
import com.geekster.StudentCourses.model.Student;
import com.geekster.StudentCourses.repository.ICourseRepository;
import com.geekster.StudentCourses.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepository studentRepository;

    @Autowired
    ICourseRepository courseRepository;

    public List<Student> getStudentByCourseId(Long id) {
        Optional.
        Course myCourse = courseRepository.findById(id).get();
        return myCourse.getStudent();
    }
}
