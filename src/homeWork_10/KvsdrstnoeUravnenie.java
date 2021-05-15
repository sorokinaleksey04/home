package homeWork_10;

import java.util.Scanner;

public class KvsdrstnoeUravnenie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("значение a");
        double a = sc.nextDouble();
        System.out.println("значение b");
        double b = sc.nextDouble();
        System.out.println("значение c");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;
        System.out.println(d);

        if (d > 0){
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("корни уравнения: х1 = " + x1 + " , " + "x2 = " + x2);
        }
        else  if (d == 0){
            double x = -b / (2 * a);
            System.out.println("динтсвенное значение х = " + x);
        }
        else System.out.println("данное уравнение не имеет решения");
    }
}
