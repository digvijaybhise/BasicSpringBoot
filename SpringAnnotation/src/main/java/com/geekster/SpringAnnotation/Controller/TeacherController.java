package com.geekster.SpringAnnotation.Controller;


import com.geekster.SpringAnnotation.ComponentScanTest.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    Teacher t1;
    @RequestMapping(value = "/teacher", method = RequestMethod.GET)
    public String teach(){
        return t1.teach();
    }
}
