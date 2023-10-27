package com.student.studentmange.JwtAuthentication;
// package com.student.studentmange.Security;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.oauth2.jwt.JwtDecoder;
// import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



// @Configuration
// public class JwtSecurityConfig {
//     // @Value(value = "${spring.security.oauth2.resourceserver.jwt.audiences}")
//     // private String audience;

//     // @Value(value = "${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
//     // private String issuer;


//     @Autowired
//     private JwtAuthenticationEntryPoint point;

//     @Autowired
//     private JwtAuthenticationFilter filter;
    

//     @Bean
//     @Deprecated
    
//     SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        
//         http.csrf(csrf -> csrf.disable())
//                 .cors(cors-> cors.disable())
//                 .authorizeHttpRequests().requestMatchers("/home/**")
//                         .authenticated().requestMatchers("/auth/login").permitAll()
//                         .anyRequest().authenticated()
//                        // .exceptionHandling(ex ->ex.JwtAuthenticationEntryPoint(point))
                        
                        
        
//         ;
//         http.addFilterBefore(filter,UsernamePasswordAuthenticationFilter.class);
//         return http.build();
//         //      http.authorizeRequests(authorizeRequests ->
//         //             authorizeRequests.anyRequest().authenticated()
//         //     )
//     //     .oauth2ResourceServer(oauth2 ->
//     //             oauth2.jwt(jwt ->
//     //                     jwt.decoder(jwtDecoder()))
//     //             );
//     //             return http.build();
//     // }

//     // // Set up the JWT decoder
//     // JwtDecoder jwtDecoder() {
//     //     return NimbusJwtDecoder.withJwkSetUri(this.issuer).build();
//     // }

//     }
// }



