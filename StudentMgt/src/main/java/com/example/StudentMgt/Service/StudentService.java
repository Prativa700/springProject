package com.example.StudentMgt.Service;

import com.example.StudentMgt.Entity.StudentEntity;

import java.util.List;

public interface StudentService {
    public String saveStudent(StudentEntity studentEntity);
    public List<StudentEntity> getAllStudent();
    public StudentEntity getStudentById(Integer id);
    public String updateStudent(Integer id, StudentEntity studentEntity);
    public String deleteStudent(Integer id);
}
