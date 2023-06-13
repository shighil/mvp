package com.pothery.uno.mvp.controllers;

import com.pothery.uno.mvp.models.Student;
import com.pothery.uno.mvp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/students/{id}")
    public Student list(@PathVariable Integer id) {
        Student student = studentService.find(id);
        return student;
    }

    @PostMapping("/students")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable Integer id) {
        studentService.delete(id);
    }
}
