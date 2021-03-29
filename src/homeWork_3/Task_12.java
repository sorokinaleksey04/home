package homeWork_3;

public class Task_12 {
    public static void main(String[] args) {
        int[] mas = new int[]{4,5,4,5,1,9};

        double mid = 0;
        int summ = 0;

        for (int i = 0; i < mas.length; i++){
             summ += mas[i];
        }
        mid = summ / mas.length;
        System.out.println(mid);
    }
}
