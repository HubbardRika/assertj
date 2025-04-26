package org.assertj.core.api.map;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.assertj.core.api.BDDAssertions.then;


class MapAssert_containsKeys_Test {

  @Test
  void should_pass_when_map_contains_keys() {
    
    Map<String, Integer> ageMap = Map.of("Alice", 30, "Bob", 25);

  
    then(ageMap).containsKeys("Alice", "Bob");
  }
}