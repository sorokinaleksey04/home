package homeWork_3;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int[] tub = new int[]{1,2,3,4,5,6,7,8,9,10};

        for (int i = 1; i <= tub.length; i++){
            System.out.println(i * x);

        }



    }
}
