package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home controller for the demo application.
 */
@RestController
public class HomeController {

    /**
     * Simple home endpoint.
     *
     * @return HTML page with background color
     */
    @GetMapping("/")
    public String home() {
        String backgroundColor = "#9c0c65";
        return "<html><body style='background-color:"
                + backgroundColor
                + "; font-family: Arial; padding: 40px;'>"
                + "<h1>Hello from java-app1!</h1>"
                + "<p>Instance is healthy and serving dynamic content.</p>"
                + "</body></html>";
    }
}
