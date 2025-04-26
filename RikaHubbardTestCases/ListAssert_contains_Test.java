package org.assertj.core.api.list;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.BDDAssertions.then;


class ListAssert_contains_Test extends BaseTest {

  @Test
  void should_pass_when_list_contains_element() {
    // GIVEN
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

    // WHEN/THEN
    then(names).contains("Bob");
  }
}