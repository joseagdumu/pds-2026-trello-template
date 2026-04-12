package com.example.backend.domain;

public class BadCodeExample {

    // Campo público (mala práctica)
    public String name;

    public BadCodeExample(String name) {
        this.name = name;
    }

    public String doSomething(String input) {

        // Variable no usada
        int unused = 42;

        // Posible NullPointerException
        if (input != null) {
            input.toString();
        }

        // Código inútil
        if (true) {
            System.out.println("Esto siempre se ejecuta");
        }

        return name;
    }
}
