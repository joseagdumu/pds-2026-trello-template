package com.example.backend.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

    @Test
    void should_create_board_with_valid_name() {
        Board board = new Board("Tablero PDS");

        assertEquals("Tablero PDS", board.getName());
    }

    @Test
    void should_fail_when_name_is_null() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> new Board(null)
        );

        assertEquals("El nombre del tablero no puede estar vacío", ex.getMessage());
    }

    @Test
    void should_fail_when_name_is_blank() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> new Board("   ")
        );

        assertEquals("El nombre del tablero no puede estar vacío", ex.getMessage());
    }
    
    @Test
    void should_fail_when_name_is_too_short() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> new Board("AB")
        );

        assertEquals(
            "El nombre del tablero debe tener al menos 3 caracteres",
            ex.getMessage()
        );
    }
}