package com.student.studentmange.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.student.studentmange.Entity.Student;
import com.student.studentmange.Sevices.StudentService;

@RestController
public class controller {
    
    @Autowired
    private StudentService studentService;

    //Getting All Student
    @GetMapping("/students")
    public List<Student> getStudents(){
    System.out.println("getAll........................students");
        return this.studentService.getStudents();
    }

    //Getting Single Student
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable String studentId){
    return this.studentService.getStudent(Long.parseLong(studentId));
    }

    
    // Getting Student By Name
    @GetMapping("/students/Name")    
    public List<String> getStudentsName(){
    return this.studentService.getStudentsName();
    }
    
    //Adding a Student
    @PostMapping("/students")
    public Student addStudent( @RequestBody Student student){
        
        return this.studentService.addStudent(student);
        
    }
    //Updating a student
    @PutMapping("/students/{studentId}")
    public Student updateStudent(@RequestBody Student student ,@PathVariable Long studentId){
        
        return this.studentService.updateStudent(student ,studentId);
    }
    
    //Deleting all Student
    @DeleteMapping("/students")
    public String DeleteAllStudent(){
        
        return this.studentService.DeleteAllStudent(); 
    }
    // getting Students by Subject
    @GetMapping("/students/subject/{Subject}")
    public List<String>  getStudentBySubject(@PathVariable("Subject") String Subject){
        System.out.println("studentbySubject ................");
        return this.studentService.getStudentBySubject(Subject);
    }

    // Search a Student
    @GetMapping("/students/Name/{name}")
    public List<Student> searchStudent(@PathVariable("name") String name) {
        return this.studentService.findStudentByNameContainingIgnoreCase(name);

}


}