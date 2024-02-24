package com.Project.First.Project.Service;

import com.Project.First.Project.model.Student;
import com.Project.First.Project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found with id " + id));

        student.setFirstname(updatedStudent.getFirstname());
        student.setAge(updatedStudent.getAge());
        student.setLastname(updatedStudent.getLastname());
        student.setAddress(updatedStudent.getAddress());
        student.setRoll_no(updatedStudent.getRoll_no());


        return studentRepository.save(student);
    }

}
