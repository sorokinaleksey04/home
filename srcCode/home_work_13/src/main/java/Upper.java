import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Upper {
    public static void main(String[] args) {

        List<String> list = List.of("one","two","three","four","five");

        System.out.println(list.stream().map(e -> e.toUpperCase(Locale.ROOT)).collect(Collectors.toList()));
    }

}
