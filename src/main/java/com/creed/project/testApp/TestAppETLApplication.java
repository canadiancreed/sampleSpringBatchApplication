package com.creed.project.testApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestAppETLApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(TestAppETLApplication.class);

        application.setWebEnvironment(false);
        application.run(args);
    }
}