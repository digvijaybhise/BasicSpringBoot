package com.geekster.SpringAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ComponentScanTest"})
public class CustomConfiguration {

    @Bean
    public Student getStudent(){
        System.out.println("Spring call .... configuration bean of student");
        return new Student("Digvijay Bhise");
    }
}
