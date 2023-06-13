package com.pothery.uno.mvp.services;

import com.pothery.uno.mvp.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
}
