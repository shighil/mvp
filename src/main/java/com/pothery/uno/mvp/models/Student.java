package com.pothery.uno.mvp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private Integer age;
}
