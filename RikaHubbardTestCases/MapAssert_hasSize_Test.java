package org.assertj.core.api.map;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.assertj.core.api.BDDAssertions.then;


class MapAssert_hasSize_Test extends BaseTest {

  @Test
  void should_pass_when_map_has_expected_size() {
    
    Map<String, Integer> ageMap = Map.of("Alice", 30, "Bob", 25);

    
    then(ageMap).hasSize(2);
  }
}