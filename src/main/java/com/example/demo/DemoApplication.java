package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan("com")
@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        String[] beanName = ctx.getBeanDefinitionNames();
        Arrays.sort(beanName);
        for(String name : beanName){
            System.out.println(name);
        }

        AppConfig config = (AppConfig) ctx.getBean(AppConfig.class);
        System.out.println(config.toString());
    }
}
