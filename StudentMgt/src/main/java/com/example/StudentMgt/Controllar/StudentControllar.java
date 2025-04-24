package com.example.StudentMgt.Controllar;

import com.example.StudentMgt.Entity.StudentEntity;
import com.example.StudentMgt.Service.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("std")
public class StudentControllar {
    @Autowired
    private StudentImpl student;

    @PostMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestBody StudentEntity studentEntity){
        String s = student.saveStudent(studentEntity);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }
@GetMapping("/get-all")
    public ResponseEntity<List<StudentEntity>> getAllStudent(){
        List<StudentEntity> allStudent = student.getAllStudent();
        return new ResponseEntity<>(allStudent,HttpStatus.OK);

    }
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<StudentEntity> getById(@PathVariable Integer id){
        StudentEntity byId = student.getStudentById(id);
        return new ResponseEntity<>(byId,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> studentUpdate(@PathVariable Integer id, @RequestBody StudentEntity student1){
        String s = student.updateStudent(id, student1);
        return new ResponseEntity<>(s,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> studentDelete(@PathVariable Integer id){
        String s = student.deleteStudent(id);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }


}
