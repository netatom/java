package com.api.todo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 API 경로에 대해
                .allowedOrigins("*") // 모든 도메인 허용
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 중요
                .allowedHeaders("*") // 헤더 허용
                .allowCredentials(false)
                .maxAge(3600); // preflight 캐시 시간
    }
}
