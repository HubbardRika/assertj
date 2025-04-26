package org.assertj.core.api.list;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.util.AssertionsUtil.expectAssertionError; 
 
Class ListAssert_doesNotContain_Test {

@Test
void should_pass_when_list_does_not_contain_element() {
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
  assertThat(names).doesNotContain("David");
}
}
