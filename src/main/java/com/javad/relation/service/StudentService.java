package com.javad.relation.service;

import com.javad.relation.model.Student;
import com.javad.relation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public void delete(long id) {
        studentRepository.deleteById(id);
    }

    public Student update(long id, Student student) {

        Student studentData = studentRepository.findById(id).get();


        if (student.getName() != null)
            studentData.setName(student.getName());
        //if (student.getAddresses() != null)
          //  studentData.setAddresses(student.getAddresses());
        return studentRepository.save(studentData);
    }
}