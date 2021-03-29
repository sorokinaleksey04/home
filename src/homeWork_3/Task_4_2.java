package homeWork_3;

import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
        //вводим любое число и вычисляем его факториал
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 1;
        int i = 1;

        do {
            i++;
            result = result * i;
            System.out.println(result);
        } while (i < n);

    }
}
