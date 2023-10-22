package com.student.studentmange.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentmange.Entity.Student;

public interface StudentDao extends JpaRepository<Student,Long> {
    

}
