package com.example.test;

import org.junit.Test;

import java.util.Optional;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class OptionalTest {
    // To try out optional and its usefulness

    static Optional<String> testString = Optional.empty();

    public OptionalTest() {
    }

    @Test
    public void whenCreatesEmptyOptional_thenCorrect() {
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
        String name = "baeldung";
        Optional<String> opt = Optional.of(name);
        assertTrue(opt.isPresent());
    }

    public static void main(String[] args) {
        System.out.println("Test optional");
        if(testString.isPresent()) {
            System.out.println("what");
        }
    }
}
