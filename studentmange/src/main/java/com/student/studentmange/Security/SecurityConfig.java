package com.student.studentmange.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtAuthenticationEntryPoint point;

    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    //  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    //     return http.oauth2Login(withDefaults()).build();
    // }
     SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http.csrf(csrf -> csrf.disable())
                .cors(cors-> cors.disable())
                .authorizeHttpRequests().requestMatchers("/home/**")
                        .authenticated().requestMatchers("/auth/login").permitAll()
                        .anyRequest().authenticated()
                       // .exceptionHandling(ex ->ex.JwtAuthenticationEntryPoint(point))
                        
                        
        
        ;
        http.addFilterBefore(filter,UsernamePasswordAuthenticationFilter.class);
        return http.build();

    }


}
