package com.student.studentmange.Dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.student.studentmange.Entity.Student;

public interface StudentDao extends JpaRepository<Student,Long> {
    
    @Query("select name from Student")
    List<String>getStudentsName();

    @Query("select s.name from Student s where s.Subject =:subject")
     List<String> getStudentBySubject(@Param("subject")String Subject);
    // s from Student as s where s.Subject=:subject


    @Query("Select s from Student s where s.name LIKE %:name%")
    List<Student>findStudentByNameContainingIgnoreCase(@Param("name")String name);

    

}
