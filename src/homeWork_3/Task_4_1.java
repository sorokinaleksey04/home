package homeWork_3;

import java.util.Scanner;

public class Task_4_1 {
    public static void main(String[] args) {
        //вывести нечетные числи от 1 до 99
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();          //вводим число 100

        int[] number = new int[var];

        int i = 0;
        do {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        } while (i < number.length);






    }
}