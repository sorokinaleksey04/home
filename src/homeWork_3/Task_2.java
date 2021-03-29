package homeWork_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        //вводим любое число и вычисляем его факториал
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        System.out.println(result);

    }
}
