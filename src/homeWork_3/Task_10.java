package homeWork_3;

public class Task_10 {
    public static void main(String[] args) {
        int[] mas = new int[]{2,3,4,5,1,6,7,8,9,10};
        int max = mas[0];
        for (int i = 0; i < mas.length; i++){
            if (mas[i] > max){
                max = mas[i];
            }
        }
        System.out.println(max);
    }
}
