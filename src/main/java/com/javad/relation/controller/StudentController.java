package com.javad.relation.controller;

import com.javad.relation.model.Student;
import com.javad.relation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student>findAll(){
        return studentService.findAll();
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id ){
      studentService.delete(id);
    }
    @PutMapping("/{id}")
    public Student update(@PathVariable long id, @RequestBody Student student){
        return studentService.update(id,student);

    }
}
