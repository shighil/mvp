package com.pothery.uno.mvp.services;

import com.pothery.uno.mvp.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    Student find(Integer id);
    Student save(Student student);

    void delete(Integer id);
}
