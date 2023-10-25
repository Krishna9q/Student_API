package com.student.studentmange.Entity;

import lombok.Data;


@Data
public class JwtRequest {
 
    private String email;

    private String password;
}