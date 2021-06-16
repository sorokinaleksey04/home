import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Average {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(2, 9, 3, 8, 7, 5);

        System.out.println("среднее значение чисел " + numbers.stream().mapToInt(Integer::intValue).average());

    }




}
