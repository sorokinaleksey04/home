package homeWork_3;

import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
        //вводим любое число и вычисляем его факториал
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i++;
            System.out.println(result);

        }

    }
}