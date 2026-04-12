package com.example.backend.domain;

public class Board {
    private final String name;

    public Board(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre del tablero no puede estar vacío");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}