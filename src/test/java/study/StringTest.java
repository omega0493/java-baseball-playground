package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("String 테스트")
public class StringTest {
    @Test
    @DisplayName("replace 테스트")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    
    @Test
    @DisplayName("split 테스트")
    void split() {
        String a = "1,2";
        String b = "1";

        String[] splitA = a.split(",");
        String[] splitB = b.split(",");

        assertThat(splitA[0]).contains("1");
        assertThat(splitA[1]).contains("2");
        assertThat(splitB[0]).contains("1");
    }

    @Test
    @DisplayName("subString 테스트")
    void subString() {
        String a = "(1, 2)";

        String substring = a.substring(1, 5);

        assertThat(substring).isEqualTo("1, 2");
    }

    @Test
    @DisplayName("charAt 테스트")
    void charAt() {
        String a = "abc";

        assertThatThrownBy(() -> a.charAt(3))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index 3 out of bounds for length 3");
    }
}
