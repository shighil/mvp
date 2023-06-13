package com.pothery.uno.mvp.services;

import com.pothery.uno.mvp.models.Student;
import com.pothery.uno.mvp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        List<Student> students = (List<Student>) studentRepository.findAll();
        return students;
    }
}
