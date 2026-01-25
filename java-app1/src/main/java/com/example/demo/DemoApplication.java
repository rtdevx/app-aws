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
 * @return HTML page with background color
 */
@GetMapping("/")
public String home() {
    String backgroundColor = "#70c3e4"; // Change this to test deployments
    return "<html><body style='background-color:"
            + backgroundColor
            + "; font-family: Arial; padding: 40px;'>"
            + "<h1>Hello from java-app1!</h1>"
            + "<p>Instance is healthy and serving dynamic content.</p>"
            + "</body></html>";
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
