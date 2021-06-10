
package com.example.RestLoginMysql.controller;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/user")
            .allowedOrigins("*")
            .allowedMethods("PUT", "DELETE", "POST", "GET")
            .allowCredentials(true).maxAge(3600);

        // Add more mappings...
    }
}
