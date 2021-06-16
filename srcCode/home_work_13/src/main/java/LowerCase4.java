import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCase4 {
    public static void main(String[] args) {

        List<String> list = List.of("vsg","idkf","LKG","fgbn","fgdfhfdh","1234","RKjd");
        list.stream()
                .filter(e ->  e.length() == 4)
                .collect(Collectors.toList())
                .forEach(e -> System.out.print(e + " "));


    }
}

