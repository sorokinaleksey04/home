import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {

    @Test
    void main() {
        List<Integer> numbers = List.of(2, 9, 3, 8, 7, 5);
        
assertArrayEquals(5.666666666666667, numbers.stream().mapToInt(Integer::intValue).average());
    }

    private void assertArrayEquals(double v, OptionalDouble average) {
    }
}