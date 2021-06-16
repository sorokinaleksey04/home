import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LowerCase4Test {

    @Test
    void main() {
        List<String> list = List.of("vsg","idkf","LKG","fgbn","fgdfhfdh","1234","RKjd");

    assertArrayEquals("idkf fgbn 1234 RKjd",list.stream()
            .filter(e ->  e.length() == 4)
            .collect(Collectors.toList())
            );
    }

    private void assertArrayEquals(String s, List<String> collect) {
    }
}