package com.geekster.StudentCourses.repository;

import com.geekster.StudentCourses.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {


    @Query(value = "select student_table.* \n" +
            "from STUDENT_TABLE\n" +
            "inner join\n" +
            "course_table\n" +
            "on student_table.student_id = course_table.fk_student_student_id\n" +
            "where course_table.course_id =:id", nativeQuery = true)
    List<Student> getStudentByCourseId(Long id);
}
