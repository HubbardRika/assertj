package org.assertj.examples;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class SoftAssertionsTest {

    @Test
    void shouldAssertMultipleConditionsSoftly() {
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat("Hello").startsWith("H"); // passes
        softly.assertThat(42).isGreaterThan(50);    // fails
        softly.assertThat(true).isFalse();          // fails

        softly.assertAll(); // will show all failed assertions
    }
}