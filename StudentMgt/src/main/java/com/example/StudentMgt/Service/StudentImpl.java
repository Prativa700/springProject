package com.example.StudentMgt.Service;

import com.example.StudentMgt.Entity.StudentEntity;
import com.example.StudentMgt.Repo.StudentRepo;
import com.example.StudentMgt.Util.CopyNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;

    @Override
    public String saveStudent(StudentEntity studentEntity) {
        StudentEntity save = studentRepo.save(studentEntity);
        return "Student save sucessfully";
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        List<StudentEntity> all = studentRepo.findAll();
        return all;
    }

    @Override
    public StudentEntity getStudentById(Integer id) {
        Optional<StudentEntity> entity = studentRepo.findById(id);
        return entity.get();
    }

    @Override
    public String updateStudent(Integer id, StudentEntity studentEntity) {
        StudentEntity studentEntity1 = studentRepo.findById(id).get();
        CopyNotNull.copyNotNullData(studentEntity1,studentEntity);
        studentRepo.save(studentEntity1);
        return "student updated";
    }

    @Override
    public String deleteStudent(Integer id) {
        studentRepo.deleteById(id);
        return "student deleted";

    }
}
