package com.Project.First.Project.Service;

import com.Project.First.Project.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student createStudent(Student student);

    Student updateStudent(Long id, Student student);
}
