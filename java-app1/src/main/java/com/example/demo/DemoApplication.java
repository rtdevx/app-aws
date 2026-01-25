package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Entry point for the demo application.
 */
@SpringBootApplication
@RestController
public final class DemoApplication {

    /**
     * Default constructor.
     */
    private DemoApplication() {
        // Prevent instantiation
    }

    /**
     * Simple home endpoint.
     *
     * @return greeting message
     */
    @GetMapping("/")
    public String home() {
        return "Hello from java-app1! Instance is healthy.";
    }

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(
                DemoApplication.class,
                args
        );
    }
}
