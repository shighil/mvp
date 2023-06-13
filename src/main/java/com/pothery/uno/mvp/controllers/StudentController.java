package com.pothery.uno.mvp.controllers;

import com.pothery.uno.mvp.models.Student;
import com.pothery.uno.mvp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> listAll(/*Model model*/) {
        List<Student> students = studentService.findAll();
        // model.addAttribute("listStudents", listStudents);
        // return "students";
        return students;
    }
}
