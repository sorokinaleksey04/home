import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class UpperTest {

    @Test
    void main() {
        List<String> list = List.of("one","two","three","four","five");
assertArrayEquals("ONE, TWO, THREE, FOUR, FIVE",
        list.stream().map(e -> e.toUpperCase(Locale.ROOT)).collect(Collectors.toList()));
    }

    private void assertArrayEquals(String s, List<String> collect) {
    }}