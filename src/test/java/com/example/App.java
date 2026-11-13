
package com.example;

public class App {

    public String greeting(String name) {

        if (name == null || name.isBlank()) {
            return "Hello, DevOps!";
        }

        return "Hello, " + name.trim() + "!";
    }

    public static void main(String[] args) {

        App app = new App();

        String name = args.length > 0 ? args[0] : "DevOps";

        System.out.println(app.greeting(name));
    }
}
