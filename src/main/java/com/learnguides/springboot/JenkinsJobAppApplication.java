package com.learnguides.springboot;

import jakarta.annotation.PostConstruct;
import org.apache.juli.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsJobAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsJobAppApplication.class, args);
    }

    @GetMapping("/get")
    public String getMessage() {
        return "Welcome To DevOps....";
    }

}
