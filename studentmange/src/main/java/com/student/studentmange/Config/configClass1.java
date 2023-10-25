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
public class configClass1 {

    @Bean
      UserDetailsService userDetailsService(){
        UserDetails u1 = User.builder().username("pradeep").password(passwordEncoder().encode("123")).roles("USER").build();
        UserDetails u2 = User.builder().username("loki").password(passwordEncoder().encode("1234")).roles("USER").build();

            return new InMemoryUserDetailsManager(u1,u2);
        }

        @Bean
         PasswordEncoder passwordEncoder(){
            return new BCryptPasswordEncoder();
        }
}

