package com.learnguides.springboot;

import jakarta.annotation.PostConstruct;
import org.apache.juli.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsJobAppApplication {

    public static final Logger logger = (Logger) LoggerFactory.getLogger(JenkinsJobAppApplication.class);

    @PostConstruct
    public void init() {
        logger.info("Welcome To Learner Guides");
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsJobAppApplication.class, args);
    }

}
