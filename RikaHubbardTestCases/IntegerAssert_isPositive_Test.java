package org.assertj.core.api.integer;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.BDDAssertions.then;

class IntegerAssert_isPositive_Test {

  @Test
  void should_pass_when_integer_is_positive() {
    // GIVEN
    int value = 42;

    // WHEN/THEN
    then(value).isPositive();
  }
}