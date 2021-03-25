public class Sum {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        double mid = 0;

        for (String num : args){
            sum += Integer.valueOf(num);
            count++;
           mid = sum / count;
        }
        System.out.println(mid);

    }
}
