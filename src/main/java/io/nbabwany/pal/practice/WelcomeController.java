package io.nbabwany.pal.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final String helloMsg;

    public WelcomeController(@Value("${welcome.message: A welcome message}") String message) {
        this.helloMsg = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return helloMsg;
    }
}