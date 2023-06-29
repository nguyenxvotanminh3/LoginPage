package com.nguyenminh.learnwebsite.security;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class UserConfig {



    public class WebConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOriginPatterns("*") // Use allowedOriginPatterns instead of allowedOrigins
                    .allowedMethods("GET", "POST", "PUT", "DELETE")
                    .allowedHeaders("*")
                    .exposedHeaders("Access-Control-Allow-Origin")
                    .allowCredentials(true)
                    .maxAge(3600);
        }
    }

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .anyRequest().authenticated() // make sure user is authenticated
                .and()
                .formLogin() .loginPage("/login")// overide default spring login page
                .defaultSuccessUrl("/home" , true)
                .permitAll() // prevent spring from redirect user many times
                .and()
                .logout().logoutUrl("/logout");
//                .and().cors()
//                .and() .csrf(). disable();

        return http.build();


    }
}

