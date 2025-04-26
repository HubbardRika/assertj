package org.assertj.core.api.integer;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.BDDAssertions.then;

class IntegerAssert_isNegative_Test extends BaseTest {

  @Test
  void should_pass_when_integer_is_negative() {
    // Given
    int value = -5;

    // When/then
    then(value).isNegative();
  }
}