package com.example.backend.domain;

public class BadCodeExample {

    public String name;

    public BadCodeExample(String name) {
        this.name = name;
    }

    public String doSomething(String input) {
        int unused = 42;

        if (input != null) {
            input.toString();
        }

        System.out.println("Esto siempre se ejecuta");

        return name;
    }
}
