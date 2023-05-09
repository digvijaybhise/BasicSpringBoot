package com.geekster.SampleApplication.controller;

import com.geekster.SampleApplication.model.Student;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping("/student")
    public String getStudentInfo(){
        return "This is Student Controller";
    }

    @PostMapping("/student")
    public String saveStudent(@RequestBody Student student){
        JSONObject jsonObject = new JSONObject(student);
        String name = jsonObject.getString("firstname");
        String userName = jsonObject.getString("lastName");
        int id = jsonObject.getInt("id");
        System.out.println(name + " " + userName + " " + id);
        return "Saving Student info";
    }

    @PutMapping("/student")
    public String updateStudent(){
        return "Updating Student Info";
    }

    @DeleteMapping("/student")
    public String deleteStudent(){
        return "Deleting Student info";
    }
}
