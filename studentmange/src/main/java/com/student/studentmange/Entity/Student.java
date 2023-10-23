package com.student.studentmange.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private int age ;
    private String Subject;
    private Long mob;

    // @Override
    // public String toString() {
    //     return "Student [name=" + name + ", age=" + age + ", Subject=" + Subject + ", mod=" + mob + "]";
    // }
    // public String getName() {
    //     return name;
    // }
    // public Student() {
    // }
    // public Student(String name, int age, String subject, Long mob) {
    //     this.name = name;
    //     this.age = age;
    //     Subject = subject;
    //     this.mob = mob;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public int getAge() {
    //     return age;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public String getSubject() {
    //     return Subject;
    // }
    // public Long getId() {
    //     return Id;
    // }
    // public void setId(Long id) {
    //     Id = id;
    // }
    // public void setSubject(String subject) {
    //     Subject = subject;
    // }
    // public Long getMob() {
    //     return mob;
    // }
    // public void setMob(Long mob) {
    //     this.mob = mob;
    // }
    

    
}
