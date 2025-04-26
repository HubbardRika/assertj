import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.util.AssertionsUtil.expectAssertionError;

Class StringAssert_isNotEmpty_Test  extends BaseTest {

  @Test
void should_pass_when_string_is_not_empty() {
  assertThat("AssertJ").isNotEmpty();
}

}
