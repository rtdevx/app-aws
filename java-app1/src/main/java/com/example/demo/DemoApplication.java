package com.example.demo;

/**
 * Entry point for the demo application.
 */
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
    public static String home() {
        return "Hello from java-app1! Instance is healthy.";
    }

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        org.springframework.boot.SpringApplication.run(DemoApplication.class, args);
    }
}
