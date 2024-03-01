package com.example.Library001.sevice.impl;

import com.example.Library001.entity.Student;
import com.example.Library001.sevice.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentRepository studentsRepository;


    @Override
    public Student save(Student student) {
        return studentsRepository.save(student);
    }

    @Override
    public Student findStudentById(int studentId) {

        return studentsRepository.findStudentById(studentId);
    }

    @Override
    public List<Student> getStudentsList() {
        return studentsRepository.getStudentsList();
    }
}
