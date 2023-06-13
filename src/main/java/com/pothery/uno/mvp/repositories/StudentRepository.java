package com.pothery.uno.mvp.repositories;

import com.pothery.uno.mvp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
