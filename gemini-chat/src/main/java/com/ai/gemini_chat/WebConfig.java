package com.ai.gemini_chat;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        WebMvcConfigurer.super.addCorsMappings(registry);
        registry.addMapping("/**")
                .allowedOrigins("https://gemini-chat-ai-1.onrender.com")
                .allowedMethods("GEt","PUT","POST","DELETE","OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
