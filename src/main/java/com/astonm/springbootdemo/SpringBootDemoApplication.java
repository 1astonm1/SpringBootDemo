package com.astonm.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = "com")
@MapperScan("com.astonm.springbootdemo.dao")
@Slf4j
public class SpringBootDemoApplication implements WebMvcConfigurer{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
        log.info("SpringBoot Demo started successfully...");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/resources/webjars/");
    }


}
