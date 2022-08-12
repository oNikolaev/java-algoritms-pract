package ru.javalearn;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberValidatorTest {

    NumberValidator numberValidator;

    @BeforeEach
    void init() {
        numberValidator = new NumberValidator();
    }

    @Test
    void number_is_simple() {
        boolean expected = true;
        boolean actual = numberValidator.is_simple(3);
        assertEquals(expected, actual, "3 is a simple number");
    }

    @Test
    void number_is_not_simple() {
        boolean expected = false;
        boolean actual = numberValidator.is_simple(10);
        assertEquals(expected, actual, "10 is a not simple number");
    }
}
