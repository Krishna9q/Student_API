package com.student.studentmange.Dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.studentmange.Entity.Student;

public interface StudentDao extends JpaRepository<Student,Long> {
    
    @Query("select name from Student")
    public List<String>getStudentsName();
    
}
