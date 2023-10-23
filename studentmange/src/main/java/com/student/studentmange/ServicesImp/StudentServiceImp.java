package com.student.studentmange.ServicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentmange.Dao.StudentDao;
import com.student.studentmange.Entity.Student;
import com.student.studentmange.Sevices.StudentService;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> getStudents() {
        return studentDao.findAll();
    }
    @Override
    public Student addStudent(Student student) {
     
        return studentDao.save(student);
     
    }
    @Override
    public String DeleteAllStudent() {
        this.studentDao.deleteAll();

        return "All Student Deleted";
    }
    @Override
    public Student updateStudent(Student student,Long studentId) {
       

        return  this.studentDao.save(student);
    }
    @Override
    public Student getStudent(Long studentId) {

        return this.studentDao.findById(studentId).orElse(null);
    }
    @Override
    public List<String> getStudentsName() {
       
        return this.studentDao.getStudentsName();
    }
    
}
