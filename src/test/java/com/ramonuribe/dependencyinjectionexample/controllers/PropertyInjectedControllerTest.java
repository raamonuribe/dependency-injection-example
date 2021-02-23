package com.ramonuribe.dependencyinjectionexample.controllers;

import com.ramonuribe.dependencyinjectionexample.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    // NOT THE WAY WE WANT TO DO THINGS
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        // Mimicking what spring framework is doing
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        assertEquals("Hello World", controller.getGreeting());
    }
}