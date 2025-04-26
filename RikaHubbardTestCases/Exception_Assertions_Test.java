package org.assertj.examples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ExceptionAssertionsTest {

    @Test
    void shouldAssertExceptionThrown() {
        assertThatThrownBy(() -> {
            throw new IllegalArgumentException("Invalid argument");
        })
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("Invalid");
    }
}