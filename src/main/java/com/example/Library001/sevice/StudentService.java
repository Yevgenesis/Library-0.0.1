package com.example.Library001.sevice;

import com.example.Library001.entity.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);

    Student findStudentById(int studentId);

    List<Student> getStudentsList();

}
