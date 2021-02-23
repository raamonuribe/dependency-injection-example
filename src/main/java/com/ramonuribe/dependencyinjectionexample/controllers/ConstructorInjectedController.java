package com.ramonuribe.dependencyinjectionexample.controllers;

import com.ramonuribe.dependencyinjectionexample.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // Since Spring 4+ You don't need to add the autowired annotation for dependency injection when
    // working with constructor based dependency injection
//    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
