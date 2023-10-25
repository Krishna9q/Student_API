package com.student.studentmange.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class appConfig {

    @Bean
     UserDetailsService userDetailsService(){
            
    UserDetails u1 =  User.builder().username("Aman").password("Aman").roles("client").build();
    UserDetails u2 = User.builder().username("Namit").password("Namit").roles("client").build();

    return new InMemoryUserDetailsManager(u1,u2) ;
    }

    @Bean
     PasswordEncoder passwordEncoder (){
        return new BCryptPasswordEncoder();
    }
    
}
