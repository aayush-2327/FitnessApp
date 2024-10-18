package org.aayush.fitnesstrackerappwithreact.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow all endpoints
                .allowedOrigins("http://localhost:5173") // Allow your frontend origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow desired HTTP methods
                .allowCredentials(true);
    }
}
