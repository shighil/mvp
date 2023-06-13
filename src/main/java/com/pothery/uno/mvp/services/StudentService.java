package com.pothery.uno.mvp.services;

import com.pothery.uno.mvp.models.Student;
import com.pothery.uno.mvp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        List<Student> students = (List<Student>) studentRepository.findAll();
        return students;
    }

    @Override
    public Student find(Integer id) {
        Optional<Student> opt = studentRepository.findById(id);
        Student student = opt.isPresent() ? opt.get() : new Student(-1,"nil",-1);
        return student;
    }

    @Override
    public Student save(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
