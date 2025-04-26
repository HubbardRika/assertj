package org.assertj.examples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayAssertionsTest {

    @Test
    void shouldAssertArrayProperties() {
        int[] numbers = {1, 2, 3, 4};

        assertThat(numbers)
            .hasSize(4)
            .contains(3)
            .containsExactly(1, 2, 3, 4)
            .doesNotContain(5);
    }
}