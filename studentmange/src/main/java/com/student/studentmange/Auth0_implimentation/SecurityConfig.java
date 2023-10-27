package com.student.studentmange.Auth0_implimentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Deprecated
public class SecurityConfig {

    @Bean 
    public JwtDecoder jwtDecoder()
    {
        return NimbusJwtDecoder.withJwkSetUri("https://dev-zljs7u4uej1owgzd.us.auth0.com/.well-known/jwks.json").build();
    }

    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception {

        http.authorizeRequests(authorizeRequests -> authorizeRequests.anyRequest().authenticated())
        .oauth2ResourceServer(oauth2ResourceServer-> oauth2ResourceServer.jwt(jwt-> jwt.decoder(jwtDecoder())));
        return http.build();
    }



    
}