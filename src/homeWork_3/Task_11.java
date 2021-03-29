package homeWork_3;

public class Task_11 {
    public static void main(String[] args) {
        int[] array = new int[]{4,-5,0,6,8};

        int max = array[0];
        int imax = 0;
        int min = array[0];
        int imin = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                imin = i;
            }
            if (array[i] > max){
                max = array[i];
                imax = i;
            }
        }
        array[imin] = max;
        array[imax] = min;

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
