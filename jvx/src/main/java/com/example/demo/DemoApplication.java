package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Entry point for the demo application.
 */
@SpringBootApplication
@ComponentScan("com.example.demo")
@SuppressWarnings("checkstyle:FinalClass")
public class DemoApplication {

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
