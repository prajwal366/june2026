
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    private final App app = new App();

    @Test
    void testGreeting() {
        assertEquals("Hello, Prajwal!", app.greeting("Prajwal"));
    }

    @Test
    void testGreetingWithSpaces() {
        assertEquals("Hello, Jenkins!", app.greeting(" Jenkins "));
    }

    @Test
    void testDefaultGreeting() {
        assertEquals("Hello, DevOps!", app.greeting(null));
    }
}
