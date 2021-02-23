package com.ramonuribe.dependencyinjectionexample.controllers;

import com.ramonuribe.dependencyinjectionexample.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
