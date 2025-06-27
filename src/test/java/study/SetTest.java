package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Set Collection 테스트")
public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

    }

    @Test
    @DisplayName("size 테스트")
    void sizeTest() {

        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("contains 테스트")
    void contains() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("ParameterizedTest 테스트")
    void parameterizedTest(int pattern) {
        assertThat(numbers.contains(pattern)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({
            "1, true",
            "2, true",
            "3, true",
            "4, false",
            "5, false"
    })
    @DisplayName("ParameterizedTest true 또는 false 반환 테스트")
    void parameterizedTest2(int pattern, boolean expected) {
        boolean result = numbers.contains(pattern);
        assertThat(result).isEqualTo(expected);
    }
}
